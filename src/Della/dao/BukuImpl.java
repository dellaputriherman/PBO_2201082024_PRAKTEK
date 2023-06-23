/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Della.model.Buku;
/**
 *
 * @author ASUS
 */
public class BukuImpl implements BukuInterface{
    
    @Override
    public void insert(Buku buku) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "insert into buku values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getTahunterbit());
        ps.executeUpdate();
    }

    @Override
    public void update(Buku buku) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "update buku set judulbuku=?, pengarang=?, penerbit=?, tahunterbit=? where kodebuku=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(5, buku.getKodebuku());
        ps.setString(1, buku.getJudulbuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.setString(4, buku.getTahunterbit());
        ps.executeUpdate();
    }

    @Override
    public void delete(Buku buku) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "delete from buku where kodebuku=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.executeUpdate();
        
    }

    @Override
    public Buku getBuku(String kode) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from buku where kodebuku=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahunterbit(rs.getString(5));
        }
        return buku;
    }

    @Override
    public List<Buku> getAll() throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from buku";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Buku> list = new ArrayList<>();
        Buku buku = null;
        while(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahunterbit(rs.getString(5));
            list.add(buku);
        }
        return list;
    }
}
