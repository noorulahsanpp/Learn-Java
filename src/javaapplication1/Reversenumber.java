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
public class Reversenumber {
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();
        int rem=0,sum=0;
        while(num>0){
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        System.out.println(sum+"");
    }
}
