/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankchallenge;

/**
 *
 * @author Noorul
 */
public class Main {
    public static void main(String args[]){
        Account account1 = new Account("Sam", "sam@sam.com", 7878787878L, 456, 25000);
        System.out.println("Account details\nName : "+account1.getName()+"\nEmail : "+account1.getEmail()+"\nPhone :"+account1.getPhone()+"\nBalance : "+account1.getBalance());
        account1.deposit(1000);
        account1.withraw(2500);
        account1.withraw(500);
        
        VipCustomer vip1 = new VipCustomer("qqsam", 8000,"qqsdfsf");
        System.out.println("Account details\nName : "+vip1.getName()+"\nEmail : "+vip1.getEmail()+"\nCredit Limit : "+vip1.getCreditLimit());
        
    }
}
