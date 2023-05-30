/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della260523;

/**
 *
 * @author ASUS
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        
        studentObject.setName("Anna");
        employeeObject.setName("Budi");
        
        ref = studentObject;
        System.out.println("Nama  :"+ref.getName());
        
        ref = employeeObject;
        System.out.println("Nama  :"+ref.getName());  
        printInformation(studentObject);
        printInformation(employeeObject);    
   }
    
    public static void printInformation(Person ref){
        if(ref instanceof Student){
            System.out.println("Nama Student    :"+ref.getName());
            System.out.println("Alamat Student  :"+ref.getAddress());
        } else if(ref instanceof Employee){
            System.out.println("Nama Student    :"+ref.getName());
            System.out.println("Alamat Student  :"+ref.getAddress());  
        }
     }
    
}
