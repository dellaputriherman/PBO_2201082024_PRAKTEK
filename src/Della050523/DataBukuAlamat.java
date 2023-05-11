/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della050523;

/**
 *
 * @author ASUS
 */
public class DataBukuAlamat {
     private BukuAlamat[] data = new BukuAlamat[100];
    private int index;
    
    public void insert(BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
        index++;
    }
    
    public void update(int index, BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
    }
    
    public BukuAlamat[] getAll(){
        BukuAlamat[] temp = new BukuAlamat[index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return temp;
    }
    
    public void delete(int index){
        data[index].setNama("");
        data[index].setAlamat("");
        data[index].setNotelp("");
        data[index].setEmail("");
    }
    
    public static void main(String[] args){
        DataBukuAlamat data = new DataBukuAlamat();
        BukuAlamat temp = new BukuAlamat();
        temp.setNama("Della");
        temp.setAlamat("Padang");
        temp.setNotelp("08318273****");
        temp.setEmail("dellaputri0694@gmail.com");
        data.insert(temp);
        BukuAlamat temp1 = new BukuAlamat();
        temp1.setNama("Rani");
        temp1.setAlamat("Padang");
        temp1.setNotelp("08318643****");
        temp1.setEmail("dellaputri0694@gmail.com");
        data.insert(temp1); 
        //tampilkan
        BukuAlamat[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("Buku Alamat ke--->"+(i+1));
            System.out.println("Nama    :"+list[i].getNama());
            System.out.println("Alamat  :"+list[i].getAlamat());
            System.out.println("No Telp :"+list[i].getNotelp());
            System.out.println("Email   :"+list[i].getEmail());
        }
    }
}