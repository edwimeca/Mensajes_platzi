/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDeDatos.mensajes_app;

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
            
        } catch (SQLException e) {
            System.out.println("There is not connection "+e);
            
        }
        
        return connection;
        
    }
    
}
