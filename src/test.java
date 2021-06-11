/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noorul
 */

import java.util.*;
public class test extends test1 implements sam{
   
    void kk(){
        System.out.print("Bye");
    }
    
   public void as(){
       
   }
   
   public static int qwe(){
       return 10;
   }
    public static void main(String[] args){
        
        List list = new ArrayList();
        list.add("Hello");
        list.add(5);
        
        String qw = "ahsan1";
        qwe();
        
        String abc = (qw=="ahsan") ? "no" : "yes";
        System.out.println(abc);
        
        ArrayList arrayList = new ArrayList();
        arrayList.add("s");
        arrayList.add(5);
        
        System.out.println(list+"\n"+arrayList);
        
        test1 tt = new test();
        tt.run();
//        tt.kk();00
    }
}

abstract class test1{
    final void run(){
        int a = 4_154;
        String b = a+"";
        int [] t = {1,2,3};
        System.out.println(t[0]);
    }
    
    abstract void kk();
}

interface sam{
    void as();
    
}
