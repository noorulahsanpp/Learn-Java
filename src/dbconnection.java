/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Noorul
 */
public class dbconnection {
    Connection con = null;
    Statement st = null;
    ResultSet rs;
    String str;
    Scanner ss = new Scanner(System.in);
  
    public dbconnection(){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
           st=con.createStatement();
        }
        catch(Exception e){
            System.err.print(e);
        }
    }
    
    public void test()
    {
        
        try
        {
            str="select * from message";
            rs=st.executeQuery(str);
            while(rs.next()){
            System.out.println(rs.getString(1));    
                        System.out.println(rs.getString(1)); 
                                    System.out.println(rs.getString(1)); 
            }
            
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
       
    }
    public void insert()
    {String name = ss.nextLine();
    String age = ss.nextLine();
    String gender = ss.nextLine();
   
            try
            {
        str="insert into message(name,email,response) values('"+name+"','"+age+"','"+gender+"')";
        st.executeUpdate(str);
    }
    catch(Exception e)
    {
        System.out.print(e);
    }
    }
    
    public static void main(String args[]){
        dbconnection db = new dbconnection();
        db.insert();
    }
    
    
}
