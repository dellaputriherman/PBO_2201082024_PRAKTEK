/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.controller;
import Della.model.*;
import Della.dao.*;
import java.util.*;
import Della.view.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class AnggotaController {
    FormAnggota view;
    Anggota anggota;
    AnggotaDao dao;
    
    public AnggotaController (FormAnggota view){
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
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = dao.getAll();
        for (Anggota a : list){
            Object[] row = {
                a.getKodeanggota(),
                a.getNamaanggota(),
                a.getAlamat(),
                a.getJeniskelamin()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void insert(){
        anggota = new Anggota();
        anggota.setKodeanggota(view.getTxtKodeAnggota().getText());
        anggota.setNamaanggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJeniskelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.insert(anggota);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
        
    }
    
    public void update(){
        int index = view.getTabelAnggota().getSelectedRow();
        anggota.setKodeanggota(view.getTxtKodeAnggota().getText());
        anggota.setNamaanggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJeniskelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.update(index, anggota);
        JOptionPane.showMessageDialog(view, "Update Data Ok");   
    }
    
    public void delete(){
        int index = view.getTabelAnggota().getSelectedRow();
        dao.delete(index);
        JOptionPane.showConfirmDialog(view, "Delete Data Ok");
    }
    
    
    public void getAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        anggota = dao.getAnggota(index);
        view.getTxtKodeAnggota().setText(anggota.getKodeanggota());
        view.getTxtNamaAnggota().setText(anggota.getNamaanggota());
        view.getTxtAlamat().setText(anggota.getAlamat());
        view.getCboJenisKelamin().setSelectedItem(anggota.getJeniskelamin());
    }

}
