/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Noorul
 */
public class Primenumber {
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();
        boolean flag= true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }
        
        if(flag){
            System.out.print("Prime number");
        }
    }
}
