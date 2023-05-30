/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B;

/**
 *
 * @author ASUS
 */
public class DataPDAM {
     private PDAM[] data = new PDAM[100];
     private int index;
    
    public void insert(PDAM bukuAlamat){
        data[index] = bukuAlamat;
        index++;
    }
    
    public void update(int index, PDAM bukuAlamat){
        data[index] = bukuAlamat;
    }
    
    public PDAM[] getAll(){
        PDAM[] temp = new PDAM [index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return temp;
    }
    
    public void delete(int index){
        data[index].setKodeNasabah("");
        data[index].setNama("");
        data[index].setIni("");
        data[index].setLalu("");
        data[index].setTarif("");
    }
    
    public static void main(String[] args){
        PDAM data = new PDAM();
        PDAM temp = new PDAM();
        temp.setKodeNasabah("021");
        temp.setNama("Della");
        temp.setIni("");
        temp.setLalu("");
        temp.setTarif("");
        data.insert(temp);
        PDAM temp1 = new PDAM();
        temp.setKodeNasabah("051");
        temp.setNama("Rani");
        temp.setIni("");
        temp.setLalu("");
        temp.setTarif("");
        data.insert(temp1); 
        //tampilkan
        PDAM[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("PDAM ke--->"+(i+1));
            System.out.println("Kode Nasabah    :"+list[i].getKodeNasabah());
            System.out.println("Nama    :"+list[i].getNama()); 
            System.out.println("Meter_bulan_ini  :"+list[i].getIni());
            System.out.println("Meter_bulan_lalu :"+list[i].getLalu());
            System.out.println("Tarif total  :"+list[i].getTarif());
        }
    }
}

