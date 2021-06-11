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
public class VipCustomer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VipCustomer() {
        this("sample", 5000, "sample@sample.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "testmail@test.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    private String name;
    private double creditLimit;
    private String email;
}
