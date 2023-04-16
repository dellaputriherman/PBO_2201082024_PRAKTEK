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
public class ProsesArray {
    public static void main(String[] args)
    {
    int[] Nilai; //deklarasi array
    int n,i,sum;
    double rata;
    int max, imax, min, imin;
    Random rand = new Random(); //2. buat objek random
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan banyak data : ");
    n =in.nextInt();
    Nilai = new int[n]; //membuat array ukuran n
    //mengisi array
    for(i=0;i<n;i++)
    {
        System.out.print("Nilai ke-"+(i+1)+" = ");
        Nilai[i]=in.nextInt();
    }
    //proses isi array
    sum = Nilai [0];
    max = Nilai [0]; imax = 0;
    min = Nilai [0]; imin = 0;
    for(i=1;i<n;i++)
    {
        sum = sum + Nilai [i];
        if(Nilai [i]>max)
        {
            max = Nilai [i];
            imax = 1;
        }
        if(Nilai [i]<min)
        {
            min = Nilai [i];
            imin = i;                   
        }
         rata = (double)sum/n;
        //menampilkan isi array 
        System.out.println("\n===Daftar Nilai===");
        for(i=0;i<n;i++)
        {
            System.out.println("Nilai ke-"+(i+1)+"  = "+Nilai[i]);
        }
        int[] bil = {4,6,2,1,7};
        System.out.println("Jumlah nilai = "+sum);
        System.out.println("Rata-rata nilai = "+rata);
        System.out.println("Nilai Terbesar = "+max);
        System.out.println("Nilai terbesar adalah nilai ke-"+(imax+1));
        System.out.println("Nilai Terkecil = "+min);
        System.out.println("Nilai terkecil adalah nilai ke-"+(imin+1));
    }
   }
    
}
