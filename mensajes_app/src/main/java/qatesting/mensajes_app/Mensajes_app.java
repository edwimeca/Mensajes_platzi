

package qatesting.mensajes_app;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author edwimeca
 */
public class Mensajes_app {

    public static void main(String[] args) {
        
        Connect connect = new Connect();
        
        Connection cnx = connect.get_connection();
        
       
        
    }
}
