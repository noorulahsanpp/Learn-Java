/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Noorul
 */
public class Polo extends Car{

  
    private String roadServiceMonths;

    public Polo(String roadServiceMonths) {
        super(6, 5, 4, false, 4, "Polo");
        this.roadServiceMonths = roadServiceMonths;
    }
  
}
