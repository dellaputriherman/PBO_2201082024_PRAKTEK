/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della050523;

/**
 *
 * @author ASUS
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String notelp;
    private String email;
    
    public BukuAlamat(){
    }
    
    public BukuAlamat(String nama, String alamat, String notelp, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNotelp(){
        return notelp;
    }
    
    public void setNotelp(String notelp){
        this.notelp = notelp;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}