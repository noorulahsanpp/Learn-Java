/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Noorul
 */
public class Arrayduplicate {
 
    public static void main(String args[]){
        int first[]= {1,0,4,6,0,6,0,4};
        int len = first.length;
        int temp=0;
        for(int i=0;i<len;i++){
            temp = first[i];
            if(temp==0){
                for(int j=len-1;j>i;j--){
                    first[j]=first[j-1];             
                }
                i=i+1;
            }
            
        
    }
for(int i: first){
            System.out.println(i);

}
    }
}
