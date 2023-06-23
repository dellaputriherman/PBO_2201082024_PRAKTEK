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
import Della.model.Pengembalian;

/**
 *
 * @author ASUS
 */
public class PengembalianImpl implements PengembalianInterface  {
    @Override
    public void insert(Pengembalian pengembalian) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "insert into pengembalian values(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeanggota());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.setString(4, pengembalian.getTgldikembalikan());
        ps.setDouble(5, pengembalian.getTerlambat());
        ps.setDouble(6, pengembalian.getDenda());
        ps.executeUpdate();
        con.close();
    }

    @Override
    public void update(Pengembalian pengembalian) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "update pengembalian set tgldikembalikan=?, terlambat=?, denda=? "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pengembalian.getTgldikembalikan());
        ps.setInt(2, pengembalian.getTerlambat());
        ps.setDouble(3, pengembalian.getDenda());
        ps.setString(4, pengembalian.getKodeanggota());
        ps.setString(5, pengembalian.getKodebuku());
        ps.setString(6, pengembalian.getTglpinjam());
        
        ps.executeUpdate();
        con.close();
    }

    @Override
    public void delete(Pengembalian pengembalian) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "delete from pengembalian "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pengembalian.getTglpinjam());
        ps.executeUpdate();
        con.close();
    }

    @Override
    public Pengembalian getPengembalian(String kodeanggota, String kodebuku, String tglpinjam) throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from pengembalian "
                 + "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setKodeanggota(rs.getString(1));
            pengembalian.setKodebuku(rs.getString(2));
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTgldikembalikan(rs.getString(4));
            pengembalian.setTerlambat(rs.getInt(5));
            pengembalian.setDenda(rs.getDouble(6));
        }
        return pengembalian;
    }

    @Override
    public List<Pengembalian> getAll() throws Exception {
        Koneksi k = new Koneksi();
        Connection con = k.getKoneksi();
        String sql = "select * from pengembalian";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> list = new ArrayList<>();
        Pengembalian pengembalian = null;
        while(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setKodeanggota(rs.getString(1));
            pengembalian.setKodebuku(rs.getString(2));
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTgldikembalikan(rs.getString(4));
            pengembalian.setTerlambat(rs.getInt(5));
            pengembalian.setDenda(rs.getDouble(6));
            list.add(pengembalian);
        }
        return list;
    }
}
