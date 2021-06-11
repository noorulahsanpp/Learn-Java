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
public class Car extends Vehicle{
    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;
    
    private int currentGear;

    public Car(int gears, int wheels, int doors, boolean isManual, int size, String name) {
        super(size, name);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrengear, changed to "+this.currentGear);
    }
    
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changevelocity called, Velocity :"+speed+" direction : "+direction);
    }

   
    
}
