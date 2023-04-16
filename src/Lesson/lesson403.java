/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-MM
 */
public class lesson403 {
      public static void main(String[] args){
          // understanding types and conversation
          double height = 4, radius = 10, volume;
          volume = 1/3 * 3.14 * radius * radius * height;
          System.out.println("volume = "+volume+".");
          
          // diletakkan diujung
          volume = 3.14 * radius * radius * height * 1/3;
          System.out.println("volume = "+volume+".");
          
          //tipe angka dibuat menjadi double
          volume = 1/3.0 * 3.14 * radius * radius * height;
          System.out.println("volume = "+volume+".");
          
          //tipe angka dicasting menjadi double
          volume =(double) 1/3 * 3.14 *radius * radius * height;
          System.out.println("volume = "+volume+".");
          
          //----------------------------------------------------
          
          System.out.println("The random number is"+Math.random()+".");
          int number;
          number =(int) (Math.random() *10);
          System.out.println("The random number is "+number+".");
          
             //----------------------------------------------------
          
          System.out.println("The random number is"+Math.random()+".");
          int number2;
          for(int i=0;i<=10;i++){ // pengulangan for pada java
          number2 =(int) (Math.random() *10);
          System.out.println("The random number is "+number2+".");
          
          //------------------------------------------------------
          
          // data types and operators practice
          
          double x =3.25;
          double y =-4.5;
          int m =23;
          int n =9;
          
          System.out.print("a.");
          System.out.println(x + m * y- (y+n) *x);
          System.out.print("b.");
          System.out.println(m / n + m % n);
          System.out.print("c.");
          System.out.println(5 * x - n / 5);
          System.out.print("d.");
          System.out.println(Math.sqrt(Math.sqrt(n)));
          System.out.print("e.");
          System.out.println((int)x);
          System.out.print("f.");
          System.out.println(Math.round(y));
      }
      
     }      
          
}
