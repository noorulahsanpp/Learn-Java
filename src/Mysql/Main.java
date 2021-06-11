/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import static Collections.List.Main.processArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noorul
 */
public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String args[]){
        DBConnection dBConnection = new DBConnection();
    Queries queries = new Queries();
        
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    Queries.viewAllItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        System.out.println("Name : ");
        String name = scanner.nextLine();
               System.out.println("Price : ");
        double price = scanner.nextDouble();
                System.out.println("Quantity : ");
        int quantity = scanner.nextInt();
        Queries.insertItem(name, price, quantity);
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        Queries.updateItem(newItem, 0, 0);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        Queries.removeItem(itemName);
    }

    public void viewAllItems() {
        Queries.viewAllItems();
        
    }
    public static void searchForItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        ResultSet resultSet = Queries.viewAnItem(itemName);
        try {
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
        

}
