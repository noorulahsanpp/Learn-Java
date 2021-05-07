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
public class Nonrepetative {
    static void longestSubstring(String inputString)
    {
        //Convert inputString to charArray
         
        inputString = "asdadad asdasdakdjnjnrjgnjg";
        
        char[] charArray = inputString.toCharArray();
         
        //Initialization
         
        String longestSubstring = null;
         
        int longestSubstringLength = 0;
         
        //Creating LinkedHashMap with characters as keys and their position as values.
         
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
         
        //Iterating through charArray
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
             
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
             
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
             
            else
            {   
                i = charPosMap.get(ch);
                 
                charPosMap.clear();
            }
             
            //Updating longestSubstring and longestSubstringLength
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                 
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        String st = ss.nextLine();
        int len = st.length();
        int tempstart=0, tempend=0, count = 0, tempcount = 0,start = 0,end = 0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                char first=st.charAt(i), second = st.charAt(j);
                if(first==second){
                    tempstart=i;
                    tempend=j;
                    count = (int) Math.abs(tempend-tempstart);
                    break;
                }
                
            }
            if(count>tempcount){
                start = tempstart;
                end = tempend;
                tempcount=count;
            }
            
            count=0;
        }
             
        
        System.out.println(st.substring(start, end));
    }
}
