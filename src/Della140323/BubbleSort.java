/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082024;
import java.util.Scanner;
import java.util.Random; //import

/**
 *
 * @author LAB-MM
 */
public class BubbleSort {
    public static void main(String[] args) {
         int[] data;
         int n,i,j,temp;
         Scanner in = new Scanner(System.in);
         Random rand = new Random();
         System.out.print("Banyak data = ");
         n = in.nextInt();
         data = new int [n];
          //mengisi array
        System.out.println("===Isi array sebelum diurutkan===");
        int enter = 0;
        for(i=0;i<n;i++)
         {
             data [i]= rand.nextInt(100)+1;
             enter = i%10;
             System.out.print(data[i]+"\t"); 
         }
        //Bubble Sort
        for(i=0;i<0;i++)
        {
            for(j=n-1;j>i+i;j--)
            {
                if(data[j]<data[j-1]) //tukar
                {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        System.out.println("===Isi array sebelum diurutkan===");
        for(i=0;i<n;i++)
        {
            System.out.print(data[i]+"\t");
        }
    }
}