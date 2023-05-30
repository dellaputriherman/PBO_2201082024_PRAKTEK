/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */


public class MenuPDAM {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        PDAM data = new PDAM();
        int pil = 0;
        
        try {
            while (pil != 5) {
                System.out.println("1. Input Data");
                System.out.println("2. Hapus Data");
                System.out.println("3. Update Data");
                System.out.println("4. Tampilkan Data");
                System.out.println("5. Keluar");
                System.out.print("Pilihan Anda: ");
                pil = Integer.parseInt(dataIn.readLine());
                
                switch (pil) {
                    case 1:
                        PDAM temp = new PDAM();
                        System.out.print("Kode Nasabah      : ");
                        temp.setKodeNasabah(dataIn.readLine());
                        System.out.print("Nama    : ");
                        temp.setNama(dataIn.readLine());
                        System.out.print("Meter_bulan_ini  : ");
                        temp.setIni(dataIn.readLine());
                        System.out.print("Meter_bulan_lalu     : ");
                        temp.setLalu(dataIn.readLine());
                        System.out.print("Tarif Total   : ");
                        temp.setTarif(dataIn.readLine());
                        
                        break;
                        
                    case 2:
                        break;
                        
                    case 3:
                     
                        break;
                        
                    case 4:
                       
                          break;
                    
                   
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
