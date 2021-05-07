/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Noorul
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
     private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
         Scanner s = new Scanner(System.in);
        int t = s.nextInt();    
        int temp=0, temp1=0;   
        int n = s.nextInt();
        int k = s.nextInt(); 
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        System.out.println("k="+k);
        for(int j=0;j<k;j++){
            temp1 = a[0];
        for(int i=0;i<n-1;i++){
            temp = a[i];
            a[i] = a[i+1];
        }
       a[n-1] = temp1;
        }
        for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
        }
    }    
}

class Sam extends JavaApplication1{
    
}
