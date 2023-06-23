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
import Della.model.Anggota;
/**
 *
 * @author ASUS
 */
public class AnggotaImpl implements AnggotaInterface {
    @Override
    public void insert(Anggota anggota) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.setString(2, anggota.getNamaanggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJeniskelamin());
        ps.executeUpdate();
        
    }

    @Override
    public void update(Anggota anggota) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "update anggota set namaanggota=?, alamat=?, jeniskelamin=? where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, anggota.getKodeanggota());
        ps.setString(1, anggota.getNamaanggota());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3, anggota.getJeniskelamin());
        ps.executeUpdate();
        
    }

    @Override
    public void delete(Anggota anggota) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "delete from anggota where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.executeUpdate();
    }

    @Override
    public Anggota getAnggota(String kode) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from anggota where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if(rs.next()) {
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
        }
        return anggota;
    }

    @Override
    public List<Anggota> getAll() throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from anggota";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs =  ps. executeQuery();
        List<Anggota> list = new ArrayList<>();
        Anggota anggota = null;
        while(rs.next()){
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}
