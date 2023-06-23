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
import Della.dao.AnggotaImpl;
import Della.dao.AnggotaInterface;
import Della.dao.BukuImpl;
import Della.dao.BukuInterface;
import Della.dao.PeminjamanImpl;
import Della.dao.PeminjamanInterface;
import Della.model.Anggota;
import Della.model.Buku;
import Della.model.Peminjaman;
import Della.view.FormPeminjaman;

/**
 *
 * @author ASUS
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman model;
    PeminjamanInterface dao;
    AnggotaInterface AnggotaInterface;
    BukuInterface BukuInterface;

    public PeminjamanController(FormPeminjaman view) {
        this.view = view;
        dao = new PeminjamanImpl();
        AnggotaInterface = new AnggotaImpl();
        BukuInterface = new BukuImpl();
    }
  
    public void clear(){
        view.getTxtKodeanggota().setText("");
        view.getTxtKodebuku().setText("");
        view.getTxtTglpinjam().setText("");
        view.getTxtTglkembali().setText("");
    }
    
    public void insert(){
        try {
            model = new Peminjaman();
            model.setKodeanggota(view.getTxtKodeanggota().getText());
            model.setKodebuku(view.getTxtKodebuku().getText());
            model.setTglpinjam(view.getTxtTglpinjam().getText());
            model.setTglkembali(view.getTxtTglkembali().getText());
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Successful Insert");
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void search(){
        try {
            String kodeanggota = view.getTxtKodeanggota().getText();
            String kodebuku = view.getTxtKodebuku().getText();
            String tglpinjam = view.getTxtTglpinjam().getText();
            
            model = dao.getPeminjaman(kodeanggota, kodebuku, tglpinjam);
            if(model != null){
                view.getTxtKodeanggota().setText(model.getKodeanggota());
                view.getTxtKodebuku().setText(model.getKodebuku());
                view.getTxtTglpinjam().setText(model.getTglpinjam());
                view.getTxtTglkembali().setText(model.getTglkembali());
            }else{
                JOptionPane.showMessageDialog(view, "Data Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            model = new Peminjaman();
            model.setKodeanggota(view.getTxtKodeanggota().getText());
            model.setKodebuku(view.getTxtKodebuku().getText());
            model.setTglpinjam(view.getTxtTglpinjam().getText());
            model.setTglkembali(view.getTxtTglkembali().getText());
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Update Successfull");
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
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
    
   public void viewTable() {
        try {
            DefaultTableModel tabelModel =
            (DefaultTableModel) view.getTabelPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> peminjamanList = dao.getAll();
            for (Peminjaman peminjaman : peminjamanList){
                Object[] data = {
                    peminjaman.getKodeanggota(),
                    peminjaman.getKodebuku(),
                    peminjaman.getTglpinjam(),
                    peminjaman.getTglkembali()
                    
                };
                tabelModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }

    public void tampilNamaanggota(){
        try {
            String kodeanggota = view.getTxtKodeanggota().getText();
            Anggota anggota = AnggotaInterface.getAnggota(kodeanggota);
            if (anggota != null){
                view.getTxtNamaanggota().setText(anggota.getNamaanggota());
            } else{
                   JOptionPane.showMessageDialog(view, "Data Tidak Ada!!");
                   view.getTxtNamaanggota().setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void tampilBuku(){
        try {
            String kodebuku = view.getTxtKodebuku().getText();
            Buku buku = BukuInterface.getBuku(kodebuku);
            if (buku != null){
                view.getTxtJudulbuku().setText(buku.getJudulbuku());
            } else{
                   JOptionPane.showMessageDialog(view, "Data Tidak Ada!!");
                   view.getTxtJudulbuku().setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}
