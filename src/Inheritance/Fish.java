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
public class Fish extends Animal{
 
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int gills, int eyes, int fins, String name, int size, int weight) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){
        
    }
    
    private void moveMuscles(){
        
    }
    
    private void moveBackFin(){
        
    }
    
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
