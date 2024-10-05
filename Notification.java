public interface Notification {
    void send(String message);
}

class SmsNotification implements  Notification{
    @Override
    public void send(String message){
        System.out.println("send sms:"+message);
    }
}

class EmailNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("send email:"+message);
    }
}

class PushNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("send push notification"+ message);
    }
}

class NotificationService {
    public void SendNotification(Notification notification,String message){
        notification.send(message);
    }
}
