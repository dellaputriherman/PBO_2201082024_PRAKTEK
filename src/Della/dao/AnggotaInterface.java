/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.dao;
import java.util.List;
import Della.model.Anggota;
/**
 *
 * @author ASUS
 */
public interface AnggotaInterface {
    public void insert(Anggota anggota) throws Exception;
    public void update(Anggota anggota) throws Exception;
    public void delete(Anggota anggota) throws Exception;
    public Anggota getAnggota(String kode) throws Exception;
    public List<Anggota> getAll() throws Exception;
}
