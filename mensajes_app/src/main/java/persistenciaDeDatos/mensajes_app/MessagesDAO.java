/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDeDatos.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author edwimeca
 */
public class MessagesDAO {

    public static void createMessageDB(Messages message) {
        Connect db_connect = new Connect();
        try ( Connection connection = db_connect.get_connection()) {
            PreparedStatement ps = null;

            String query = "INSERT INTO `mensaje_app`.`mensaje` (`mensaje`, `autor_mensaje`) VALUES (?,?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAutor_message());
            ps.executeUpdate();
            System.out.println("Message created");

        } catch (SQLException e) {
            System.out.println("The message was not created " + e);
        }
    }

    public static void reedMessagesDB() {
        Connect db_connect = new Connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try ( Connection connection = db_connect.get_connection()) {
            String query = "SELECT * FROM mensaje_app.mensaje";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Message: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("DAte: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("The messages could not recovery "+e);
            
        }
    }

    public static void deleteMessageDB(int id_message) {
        Connect db_connect = new Connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try ( Connection connection = db_connect.get_connection()) {
            String query = "DELETE FROM mensaje WHERE id_mensaje = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, id_message);
            ps.executeUpdate();
            System.out.println("The message has been deleted");

        } catch (SQLException e) {
            System.out.println("The message has not been deleted " + e);
        }
    }

    public static void updateMessageDB(Messages message) {
        Connect db_connect = new Connect();
        try ( Connection connection = db_connect.get_connection()) {
            PreparedStatement ps = null;
            String query = "UPDATE mensaje SET mensaje = ? WHERE id_mensaje = ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setInt(2, message.getId_messages());
            ps.executeUpdate();
            System.out.println("Message uptaded");
        } catch (SQLException e) {
            System.out.println("The message was not updated " + e);
        }
    }
}
