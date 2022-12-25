/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blooddonationmanagementsystemfinal;

import java.sql.*;

/**
 *
 * @author mahbub
 */
public class DBConnection {
    Connection cons = null;
    
    public static Connection ConnectionDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:UsersDB.db");
            System.out.println("Connection Successfully");
            return con;
        }catch(Exception e){
            System.out.println("Connection failed due to "+e);
            return null;
        }
    }
}
