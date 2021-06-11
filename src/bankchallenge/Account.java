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
public class Account {

    private int accNum;
    private double balance;
    private String name;
    private String email;
    private long phone;
    
    Account(){
        this("Account1", "sampleaccount@account.com", 9898989898L, 123, 500);
    }
    
    Account(String name, String email, long phone, int accountno,double balance){
        setName(name);
        setEmail(email);
        setPhone(phone);
        setAccNum(accNum);
        setBalance(balance);
    }
    
    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Current balance : "+this.balance);
    }
    
    public void withraw(int amount){
        if(this.balance>amount){
            this.balance -= amount;
            System.out.println("Amount : "+amount+" successfully deducted from account. Balance : "+this.balance);
        }
        else{
            System.out.println("Insufficient fund. Current balance : "+this.balance);
        }
    }
    
}
