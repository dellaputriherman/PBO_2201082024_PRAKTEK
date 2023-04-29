/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della280423;

/**
 *
 * @author ASUS
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(23);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setScienceGrade(80);
        
        
        //Tampilkan 
        System.out.println("Nama                :"+annaRecord.getName());
        System.out.println("Alamat              :"+annaRecord.getAddress());
        System.out.println("Umur                :"+annaRecord.getAge());
        System.out.println("Matematika          :"+annaRecord.getMathGrade());
        System.out.println("B Inggris           :"+annaRecord.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan    :"+annaRecord.getScienceGrade());
        System.out.println("Rata-Rata Nilai     :"+annaRecord.getAverage());
        
        StudentRecord aliRecord = new StudentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Padang");
        aliRecord.print("");
        aliRecord.print(80,70,80);
        
        
        StudentRecord budiRecord = new StudentRecord("Budi","Bukittinggi");
        budiRecord.print("");
        System.out.println("Jumlah Ssiwa   :"+
                StudentRecord.getStudentCount());
    }
    
}
