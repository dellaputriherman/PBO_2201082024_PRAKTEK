/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Della.model.Peminjaman;
/**
 *
 * @author ASUS
 */
public class PeminjamanImpl implements PeminjamanInterface{
   
    public void insert(Peminjaman peminjaman) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();}

   
    public void update(Peminjaman peminjaman) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "update peminjaman set tglkembali=? "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglkembali());
        ps.setString(2, peminjaman.getKodeanggota());
        ps.setString(3, peminjaman.getKodebuku());
        ps.setString(4, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }

   
    public void delete(Peminjaman peminjaman) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "delete from peminjaman "
                +  "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }

  
    public Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from peminjaman "
                +  "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }


    public List<Peminjaman> getAll() throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        Peminjaman peminjaman = null;
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}
