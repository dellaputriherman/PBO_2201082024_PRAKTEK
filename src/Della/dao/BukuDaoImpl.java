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
 * @author Ideapad 3 14ITL6
 */
public class BukuDaoImpl implements BukuDao {
    private List<Buku> data = new ArrayList();
    
       public BukuDaoImpl(){
        data.add(new Buku ("A001","Algoritma Pemrograman","Della","Sinar Dunia"));
        data.add(new Buku ("B002","Pemrograman WEB","Putri","Bintang obor"));
        
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku>getAll(){
        return data;
    }
}
