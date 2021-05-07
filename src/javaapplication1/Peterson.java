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
public class Peterson {
    
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();
        int rem,sum=0,fact=1,temp=num;
        while(num>0){
            rem = num%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum= sum+fact;
            num=num/10;
            fact=1;
        }
        if(temp==sum){
            System.out.println("Yes");
        }
    }
    
}
