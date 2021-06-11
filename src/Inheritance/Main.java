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
public class Main {
    
    public static void main(String args[]){
    Animal animal = new Animal("Animal", 1,1,5,5);    
    
    Dog dog = new Dog(2, 4, 1, 20, "long silky", "sam", 5, 25);
//    dog.eat();
    dog.walk();
//    dog.run();
    }
    
}
