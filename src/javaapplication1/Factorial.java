/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Noorul
 */
public class Factorial {
    
    public int fact(int num){
        if(num==0){
            return 1;
        }
        else{
            return(num*fact(num-1));
        }
    }
    
    
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        int num =  (int)Math.random();
        int sum=1;
        for(int i=1;i<=num;i++){
            sum = sum*i;
            
        }System.out.print(sum+"");
        
        Factorial fc = new Factorial();
        int a =fc.fact(num);
        System.out.println("\n"+a);
    }
}
