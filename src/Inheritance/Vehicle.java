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
public class Vehicle {

    public Vehicle(int size, String name) {
        this.size = size;
        this.name = name;
        
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    private int size;
    private String name;
    
    private int currentVelocity;
    private int currentDirection;
    
    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Vehicle.steer() Steering at "+this.currentDirection+" Degrees");
    }
    
    public void move(int velocity, int direction){
        this.currentDirection= direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move movie at"+this.currentVelocity+" in direction "+this.currentDirection);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    
    
    public void stop(){
        this.currentVelocity = 0;
    }
}
