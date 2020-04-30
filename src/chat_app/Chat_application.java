package chat_app;
/**
 *
 * @author Abdelfattah
 */

public class Chat_application {
    public static void main(String[] args) {
        // TODO code application logic here
        Chat_server p = new Chat_server();
        Chat_client x =new Chat_client();
        p.setVisible(true);
        x.setVisible(true);
        p.setLocation(9, 100);
        x.setLocation(970, 100);
    }
    
}
