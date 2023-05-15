/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jkque
 */
public class Conexion {
    
    public static Connection getConexion(){
      
        String url = "jdbc:sqlserver://LAPTOP-4H452QMO;"
                + "database=escuela;"
                + "user=sa;"
                + "password=pavilion98;";
                //+ "loginTimeout=30;";
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
        
    }
}
