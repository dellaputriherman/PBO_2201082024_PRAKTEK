/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-MM
 */
// import 

public class lesson404 {
      public static void main(String[] args){
      
          // string operationd example
          String string1 = "Hello";
          String string2 ="caron";
          String string3 =""; // empty string or null
          string3="How are you ".concat(string2 );
          System.out.println("String3: "+string3);
          
          //get length
          System.out.println("Length: "+string1.length());
          // get substring beginning with character 0, up to,
          // but not including character 5
          System.out.println("Sub:"+string3.substring(0,5));
          
          //uppercase
          System.out.println("Upper:"+ string3.toUpperCase());
          
          //----------------------------------------------------------
          // string concatenation example
          String s1 = "This is a ";
          String s2 = "string";
          String s3 = s1+s2;
          String s4 = "This is a "+s2;
          s1+=s2;
          String s5= "saya ";
          String s6= "fidia";
          s6+=s5;
          System.out.println("s1: "+s1);
          System.out.println("s2: "+s2);
          System.out.println("s3: "+s3);
          System.out.println("s4: "+s4);
          System.out.println("s5: "+s6);
          
          //------------------------------------------------------------
          //compareTo and equals
          String s10,s20;
          s10="abc";
          s20="cde";
          System.out.println(s10.compareTo(s20));
          
          s10="abc";
          s20="ABC";
          System.out.println(s10.equals(s20));
          System.out.println(s10.equalsIgnoreCase(s20));
          
          //------------------------------------------------------------
          
          
      }    
}
