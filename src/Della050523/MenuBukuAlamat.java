/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della050523;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class MenuBukuAlamat {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        DataBukuAlamat data = new DataBukuAlamat();
        int pil=0;
        try {
            
            while(pil!=5){
                System.out.println("1.Input Data");
                System.out.println("2.Hapus Data");
                System.out.println("3.Update Data");
                System.out.println("4.Tampilkan");
                System.out.println("5.Keluar");
                System.out.print("Pilihan Anda ?");
                pil =Integer.parseInt(dataIn.readLine());
                switch(pil){
                    case 1:
                        BukuAlamat temp = new BukuAlamat();
                        System.out.print("Nama      :");
                        temp.setNama(dataIn.readLine());
                        System.out.print("Alamat    :");
                        temp.setAlamat(dataIn.readLine());
                        System.out.print("No Telp   :");
                        temp.setNotelp(dataIn.readLine());
                        System.out.print("Email     :");
                        temp.setEmail(dataIn.readLine());
                        data.insert(temp); 
                        break;
                    case 4:
                        BukuAlamat[] list = data.getAll();
                        for(int i=0;i<list.length;i++){
                            System.out.println("Buku Alamat ke--->"+(i+1));
                            System.out.println("Nama    :"+list[i].getNama());
                            System.out.println("Alamat  :"+list[i].getAlamat());
                            System.out.println("No Telp :"+list[i].getNotelp());
                            System.out.println("Email   :"+list[i].getEmail());
                        }
                        break;
                }
            }

        } catch (Exception ex) {

        }
    }
}