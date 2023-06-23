/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.dao;
import java.util.List;
import Della.model.Peminjaman;
/**
 *
 * @author ASUS
 */
public interface PeminjamanInterface {
    public void insert(Peminjaman peminjaman) throws Exception;
    public void update(Peminjaman peminjaman) throws Exception;
    public void delete(Peminjaman peminjaman) throws Exception;
    public Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    public List<Peminjaman> getAll() throws Exception;
}
