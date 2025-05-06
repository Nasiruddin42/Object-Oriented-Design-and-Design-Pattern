public class NotificationService {
    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory() ;

        Notification notification1 = factory.createNotification("SMS") ;
        notification1.notifyUser("Hello via SMS");

        Notification notification2 = factory.createNotification("Email") ;
        notification2.notifyUser("Hello via Email");

        Notification notification3 = factory.createNotification("PUSH") ;
        notification3.notifyUser("Hello via Push");
    }
    
}
