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
            Connection con = DriverManager.getConnection("sdbc:sqlite:UsersDB.db");
            
        }catch(Exception e){
            
        }
    }
}
