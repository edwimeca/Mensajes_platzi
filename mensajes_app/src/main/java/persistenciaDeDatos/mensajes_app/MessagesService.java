/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDeDatos.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author edwimeca
 */
public class MessagesService {
    
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String message = sc.nextLine();
        System.out.println("What is your name");
        String name = sc.nextLine();
        
        Messages messages = new Messages();
        messages.setMessage(message);
        messages.setAutor_message(name);
        
        MessagesDAO.createMessageDB(messages);
        
        
    }
    
    public static void showMessages(){
        MessagesDAO.reedMessagesDB();
    }
    
    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the Id message to delete");
        int id_message = sc.nextInt();
        MessagesDAO.deleteMessageDB(id_message);
        
    }
    
    public static void editMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your new message");
        String message = sc.nextLine();
        System.out.println("What is the ID to update");
        int id_message = sc.nextInt();
        Messages messageUpdate = new Messages();
        messageUpdate.setMessage(message);
        messageUpdate.setId_messages(id_message);
        MessagesDAO.updateMessageDB(messageUpdate);
    }
}
