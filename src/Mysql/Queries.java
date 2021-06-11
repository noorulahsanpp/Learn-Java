/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import static Mysql.DBConnection.statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noorul
 */
public class Queries {
    
    static ResultSet resultSet = null;
    static String query="";
    
    public static void insertItem(String name, double price, int quantity){
        query = "insert into itemlist(name,price,quantity) values('"+name+"','"+price+"','"+quantity+"')";
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void updateItem(String name, double price, int quantity){
        query = "update itemlist set price = '"+price+"', quantity = '"+quantity+"' where name = '"+name+"'";
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void removeItem(String name){
        query = "delete from itemlist where name = '"+name+"'";
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void viewAllItems(){
        query = "select *from itemlist";
        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
        } 
      
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ResultSet viewAnItem(String name){
        query = "select *from itemlist where name = '"+name+"'";
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
    
}
