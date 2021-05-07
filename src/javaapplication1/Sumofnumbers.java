/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Noorul
 */
public class Sumofnumbers {
    
    
    public int method(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
    
    public int method1(int n){
        int sum = 0;
        
            sum = n *(n+1)/2;
        
        return sum;
    }
    
    public static void main(String args[]){
        Sumofnumbers s = new Sumofnumbers();
        System.out.println(""+s.method(10));
        System.out.println(""+s.method1(10));
    }
    
}
