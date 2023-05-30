/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della260523;

/**
 *
 * @author ASUS
 */
public class StudentRecord {
     protected String name;
    protected String address;
    protected String age;
        
    public StudentRecord(){
        System.out.println("SuperClass");
    }
    
    public StudentRecord(String name, String address, String age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public StudentRecord(String name){
        this.name = name;
        this.address = "";
        this.age ="";
    }
    
    public String getName(){
        System.out.println("StudentRecord name:" + name);
        return name;
    }
    public String getAddress(){
        return address;
    }
     public String getAge(){
        return age;
    }
     
      
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(String age){
        this.age= age;
    }
}