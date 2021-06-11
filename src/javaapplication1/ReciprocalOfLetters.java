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
public class ReciprocalOfLetters {
    
    public static String reciprocalString(String s){
        int len = s.length();
        char a = 122;
        System.out.println(a);
        String res = "";
        for(int i =0;i<len;i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch<='Z'){
                int pos = ch - 65;
                ch = (char)(90-pos);
                
            }
            if(ch>='a' && ch<='z'){
                int pos = ch - 97;
                ch=(char)(122-pos);
            }
            res = res+ch;
        }
        return res;
    }
    
    public static void main(String args[]){
        System.out.println(reciprocalString("Abc"));
    }
}
