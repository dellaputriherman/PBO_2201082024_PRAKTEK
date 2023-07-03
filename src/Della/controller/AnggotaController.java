/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.Controller;

import Della.view.FormAnggota;
import Della.model.Anggota;
import Della.dao.AnggotaDao;
import Della.dao.AnggotaDaoImpl;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * author ASUS
 */
public class AnggotaController {
    private Anggota anggota;
    private FormAnggota view;
    private AnggotaDao dao;
    
    public AnggotaController(FormAnggota view){
        this.view = view;
        dao = new AnggotaDaoImpl();       
    }
    
    public void clearForm(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");   
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) view.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = dao.getAll();
        for (Anggota a : list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row); 
        }
    }
    
    public void insert(){
        anggota = new Anggota();
        anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.insert(anggota);
        JOptionPane.showMessageDialog(view,"Entri Data Ok");
    }
    
    public void getAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        anggota = dao.getAnggota(index);
        view.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
        view.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
        view.getTxtAlamat().setText(anggota.getAlamat());
        view.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
    }
     public void updateAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.update(index, anggota);
        JOptionPane.showMessageDialog(view,"Update Data Ok");
    }
      public void deleteAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        dao.delete(index);
         JOptionPane.showMessageDialog(view,"Delete OK");  
    }
}
