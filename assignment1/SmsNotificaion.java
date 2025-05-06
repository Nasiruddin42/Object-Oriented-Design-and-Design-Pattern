public class SmsNotificaion implements Notification {

    @Override
    public void notifyUser(String meessage){
        System.out.println("Senting sms notification: " + meessage);
    }
}
