/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.model;

/**
 *
 * @author ASUS
 */
public class Anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;
    
    public Anggota(){
       }
   
    public Anggota (String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;   
    }

    
    
    //kodeanggota
    public String getKodeAnggota (){
        return kodeAnggota;
    }
    
    public void setKodeAnggota (String kodeAnggota){
        this.kodeAnggota = kodeAnggota;
    }
    
    //namaanggota
     public String getNamaAnggota (){
        return namaAnggota;
    }
    public void setNamaAnggota (String namaAnggota){
        this.namaAnggota = namaAnggota;
    }
    
    //alamat
     public String getAlamat (){
        return alamat;
    }
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    
    //jeniskelamin
     public String getJenisKelamin (){
        return jenisKelamin;
    }
    public void setJenisKelamin (String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }   
}
