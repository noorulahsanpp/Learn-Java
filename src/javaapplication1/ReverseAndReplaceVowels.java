/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Noorul
 */
public class ReverseAndReplaceVowels {
    
    
    public static String method1(String str){
        char[] strArray = str.toCharArray();
        List<Character> vowList = new ArrayList();
        List<Integer> vowPos = new ArrayList();
        for(int i=0;i<str.length();i++){
            char check = strArray[i];
            if(check=='a'||check=='e'||check=='i'||check=='o'||check=='u'){
                vowList.add(check);
                vowPos.add(i);
            }
        }
        Collections.reverse(vowList);
        Iterator<Integer> it = vowPos.iterator();
        int count = 0;
        while(it.hasNext()){
            strArray[it.next()] = vowList.get(count);
            count++;
        }
        
        String res = new String(strArray);
        return res;
    }
    
    
    public static String method2(String str){
        return null;
    }
    
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        String str = ss.nextLine();
        
        System.out.println(method1(str));
    }
}
