/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Noorul
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }
   public boolean addNewContact(Contact contact){
       if(findContact(contact.getName()) >= 0){
           System.out.println("Contact already exists");
           return false;
       }
       myContacts.add(contact);
       return true;
   }
   
   public void updateContact(Contact oldContact, Contact newContact){
       int findPosition = findContact(oldContact);
       if(findPosition<0){
           System.out.println(oldContact.getName()+ "was not found");
       }
   }
    
   private int findContact(Contact contact){
       return this.myContacts.indexOf(contact);
   }
   
   private int findContact(String contactName){
       for(int i=0;i<this.myContacts.size();i++){
           Contact contact = this.myContacts.get(i);
           if(contact.getName().equals(contactName)){
               return i;
           }
       }
       return -1;
   }
}
