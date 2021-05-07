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
public class Reversearray {
   public static void reverseArray(int[] arr, int n){
       int x = Integer.MIN_VALUE/Integer.MAX_VALUE;
       
       for(int i=0;i<n/2;i++){
           swap(arr, i, n+(i*x)+x);
       }
   }
   
   public static void swap(int[]arr, int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
//       return arr;
   }
  
    // Drivers code
    public static void main(String[] args)
    {
        int arr[] = { 5, 3, 7, 2, 1, 6, 4};
        int n = arr.length;
  
        
        reverseArray(arr, n);
  
        // print the reversed array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
