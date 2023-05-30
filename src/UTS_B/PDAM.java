/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B;

/**
 *
 * @author ASUS
 */
public class PDAM {
    private String kodenasabah;
    private String nama;
    private String ini;
    private String lalu;
    private String tarif;
    
    public PDAM(){
    }
    
    public PDAM(String kodenasabah, String nama, String ini, String lalu, String tarif){
        this.kodenasabah = kodenasabah;
        this.nama = nama;
        this.ini = ini;
        this.lalu = lalu;
        this.tarif = tarif;
    }
    
    public String getKodeNasabah(){
        return kodenasabah;
    }
    
    public void setKodeNasabah(String kodenasabah){
        this.kodenasabah = kodenasabah;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getIni(){
        return ini;
    }
    
    public void setIni(String ini){
        this.ini = ini;
    }
    
    public String getLalu(){
        return lalu;
    }
    
    public void setLalu (String lalu){
        this.lalu = lalu;
    }
    
    public String getTarif(){
        return tarif;
    }
    
    public void setTarif (String tarif){
        this.tarif = tarif;
    }
}
    

