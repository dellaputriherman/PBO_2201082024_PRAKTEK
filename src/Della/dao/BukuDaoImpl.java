/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.dao;
import java.util.List;
import java.util.ArrayList;
import Della.model.Buku;

/**
 *
 * @author ASUS
 */
public class BukuDaoImpl implements BukuDao {
    private final List<Buku> data = new ArrayList();
    
       public BukuDaoImpl(){
        data.add(new Buku ("A001","Algoritma Pemrograman","Della","Sinar Dunia"));
        data.add(new Buku ("B002","Pemrograman WEB","Putri","Bintang obor"));
        
    }
    
    @Override
    public void insert(Buku buku){
        data.add(buku);
    }
    @Override
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    @Override
    public void delete(int index){
        data.remove(index);
    }
    
    @Override
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    @Override
    public List<Buku>getAll(){
        return data;
    }
}
