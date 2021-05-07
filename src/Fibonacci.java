
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noorul
 */
public class Fibonacci {
    static int n1=0, n2=1,n3=0;
    
    public void normalFib(long limit){
        
        for(int i=0;i<limit;i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
    
    public void recFib(long limit){
        if(limit>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            recFib(limit-1);
        }
    }
    
    
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        long num = ss.nextInt();
        Fibonacci fib = new Fibonacci();System.out.println(n1+"\n"+n2);
//        fib.normalFib(num);
//        System.out.println("\n");
        fib.recFib(num-2);
    }
}
