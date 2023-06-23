/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.dao;
import java.util.List;
import Della.model.Pengembalian;
/**
 *
 * @author ASUS
 */
public interface PengembalianInterface {
    public void insert(Pengembalian pengembalian) throws Exception;
    public void update(Pengembalian pengembalian) throws Exception;
    public void delete(Pengembalian pengembalian) throws Exception;
    public Pengembalian getPengembalian(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    public List<Pengembalian> getAll() throws Exception;
}
