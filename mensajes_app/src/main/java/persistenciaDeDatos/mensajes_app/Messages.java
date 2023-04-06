/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDeDatos.mensajes_app;

/**
 *
 * @author edwimeca
 */
public class Messages {
    
    int  id_messages;
    String message;
    String autor_message;
    String date_message;

    public Messages() {
    }

    public Messages(String message, String autor_message, String date_message) {
        this.message = message;
        this.autor_message = autor_message;
        this.date_message = date_message;
    }

    public int getId_messages() {
        return id_messages;
    }

    public void setId_messages(int id_messages) {
        this.id_messages = id_messages;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAutor_message() {
        return autor_message;
    }

    public void setAutor_message(String autor_message) {
        this.autor_message = autor_message;
    }

    public String getDate_message() {
        return date_message;
    }

    public void setDate_message(String date_message) {
        this.date_message = date_message;
    }
}
