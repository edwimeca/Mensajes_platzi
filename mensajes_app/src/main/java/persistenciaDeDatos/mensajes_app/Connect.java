/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qatesting.mensajes_app;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


/**
 *
 * @author edwimeca
 */
public class Connect {
    
    public Connection get_connection() {  
        Connection connection = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app","root","Eleandro.2024");
            if (connection != null) {
                System.out.println("Connection OK");
                    
                }
            
        } catch (SQLException e) {
            System.out.println("There is not connection "+e);
            
        }
        
        return connection;
        
    }
    
}
