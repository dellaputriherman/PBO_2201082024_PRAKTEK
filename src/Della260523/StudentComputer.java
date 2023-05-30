/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della260523;

/**
 *
 * @author ASUS
 */
   public class StudentComputer extends StudentRecord {
   double network;
   double pbo;
   double web;
   double average;
   
   //***NETWORK***//
   public double getNetwork (){
        return network;
    }
    public void setNetwork (double network){
        this.network = network;
    }
    
    //***PBO***//
     public double getPbo (){
        return pbo;
    }
    public void setPbo (double pbo){
        this.pbo = pbo;
    }
    
     //***WEB***//
    public double getWeb (){
        return web;
    }
    public void setWeb (double web){
        this.web = web;
    }
    
    
     public double getAverage (){
         average = (web + pbo + network)/3;
        return average;
    }
    public void setAverage (double average){
        this.average = average;
    }
       
    @Override
    public String getName(){
        System.out.println("StudentComputer = " + name);
        return name;
    }
    
    public static void main(String[] args){
        StudentComputer siswa1 = new StudentComputer();
            siswa1.setNetwork(90);
            siswa1.setPbo(80);
            siswa1.setWeb(70);
           
            StudentRecord ref;
            ref = siswa1;
            ref.setName("Della");
            ref.setAddress("Padang");
            ref.setAge("19 Tahun");
            
            System.out.println("Nama    = " + ref.getName());
            System.out.println("Alamat  = " + ref.getAddress());
            System.out.println("Umur    = " + ref.getAge());
            System.out.println("\nNilai Kompetisi Komputer");
            System.out.println("PBO     = " + siswa1.getPbo());
            System.out.println("NETWORK = " + siswa1.getNetwork());
            System.out.println("WEB     = " + siswa1.getWeb());
            System.out.println("Rata-rata = " + siswa1.getAverage());     
       
    }
    
}

