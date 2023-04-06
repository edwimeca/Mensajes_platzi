package persistenciaDeDatos.mensajes_app;


import java.util.Scanner;

/**
 *
 * @author edwimeca
 */
public class Messages_app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("-------------");
            System.out.println("Messages App");
            System.out.println("1. Create Message");
            System.out.println("2. Show Messages");
            System.out.println("3. Delete Message");
            System.out.println("4. Edit Message");
            System.out.println("5. Exit");

            //read the selected option
            option = sc.nextInt();

            switch (option) {
                case 1:
                    MessagesService.createMessage();
                    break;
                case 2:
                    MessagesService.showMessages();
                    break;
                case 3:
                    MessagesService.deleteMessage();
                    break;
                case 4:
                    MessagesService.editMessage();

                    break;
                case 5:
                    break;
                default:
                    break;
            }

        } while (option != 5);

    }
}
