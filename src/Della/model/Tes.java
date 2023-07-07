/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della.model;

/**
 *
 * @author ASUS
 */
public class Tes {
    public static void main(String[]args){
        try{
         System.out.println(args[0]);
         System.out.println(1/0);
    }catch(Exception ex){
        System.out.println("Error :" + ex.getMessage());
        }
    }
}
