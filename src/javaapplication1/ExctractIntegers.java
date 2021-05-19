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
public class ExctractIntegers {

    public static boolean check(char ch) {
        if (Character.isDigit(ch)) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> extractIntegerWords(String s) {

        ArrayList<String> vv = new ArrayList<String>();
        int len = s.length();
        String num = "";
        int pos;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (check(ch) == true) {
                if (i > 0 && check(s.charAt(i - 1))) {
                    pos = vv.lastIndexOf(num);
                    if (num.contains("0")) {
                        String val = num + "" + ch;
                        vv.set(pos, val);
                        num = val;
                    } else {
                        int sem = Integer.parseInt(num);
                    sem = (sem * 10 + Integer.parseInt(String.valueOf(ch)));
                    num = sem + "";
                    vv.set(pos,num + "");
                    }
                } else {
                    num = String.valueOf(ch);
                    vv.add(num + "");
                }
            }

        }
        return vv;
    }
     public static ArrayList<String> extractIntegerWords1(String s) {

        ArrayList<String> vv = new ArrayList<String>();
        int len = s.length();
        String num = "";
        int pos;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (check(ch) == true) {
                if(((i+1)<len)&&check(s.charAt(i+1)) ){
                    
                num = num+ch;
               continue;
            }
                else{
                    num=num+ch;
                    vv.add(num+"");
                    num="";
                }
                
            }
        }
        return vv;
    }

    public static void main(String args[]) {
        System.out.println(extractIntegerWords1("00001pra0000khar54"));
    }

}
