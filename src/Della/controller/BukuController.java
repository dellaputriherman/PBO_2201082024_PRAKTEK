/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.controller;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Della.dao.BukuImpl;
import Della.dao.BukuInterface;
import Della.model.Buku;
import Della.view.FormBuku;
/**
 *
 * @author ASUS
 */
public class BukuController {
     FormBuku view;
    Buku model;
    BukuInterface dao;

    public BukuController(FormBuku view) {
        this.view = view ;
        dao = new BukuImpl();
    }
    
    public void clear(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
        view.getTxtTahunTerbit().setText("");
    }
    
    public void insert(){
        try {
            model = new Buku();
            model.setKodebuku(view.getTxtKodeBuku().getText());
            model.setJudulbuku(view.getTxtJudulBuku().getText());
            model.setPengarang(view.getTxtPengarang().getText());
            model.setPenerbit(view.getTxtPenerbit().getText());
            model.setTahunterbit(view.getTxtTahunTerbit().getText());
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Successful Insert");
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search(){
        try {
            String kodebuku = view.getTxtKodeBuku().getText();
            model = dao.getBuku(kodebuku);
            if(model != null){
                view.getTxtJudulBuku().setText(model.getJudulbuku());
                view.getTxtPenerbit().setText(model.getPenerbit());
                view.getTxtPengarang().setText(model.getPengarang());
                view.getTxtTahunTerbit().setText(model.getTahunterbit());
                
            }else{
                JOptionPane.showMessageDialog(view, "Data Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            model = new Buku();
            model.setKodebuku(view.getTxtKodeBuku().getText());
            model.setJudulbuku(view.getTxtJudulBuku().getText());
            model.setPenerbit(view.getTxtPenerbit().getText());
            model.setPengarang(view.getTxtPengarang().getText());
            model.setTahunterbit(view.getTxtTahunTerbit().getText());
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Successful Update");
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
    try {
        int pil = JOptionPane.showConfirmDialog(view, "Apakah Yakin Dihapus?");
            if(pil == 0){
                dao.delete(model);
                JOptionPane.showMessageDialog(view, "Successful Delete");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void viewTable(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTabelBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> bukuList = dao.getAll();
            for(Buku buku : bukuList){
                Object[] data = {
                buku.getKodebuku(),
                buku.getJudulbuku(),
                buku.getPenerbit(),
                buku.getPengarang(),
                buku.getTahunterbit()
                };
                    tabelModel.addRow(data);
                }
            } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
