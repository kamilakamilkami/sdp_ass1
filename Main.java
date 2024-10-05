public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Payment creditCardPayment = new CreditCardPayment();
        processor.processPayment(creditCardPayment, 100.0);
        Payment payPalPayment = new PayPalPayment();
        processor.processPayment(payPalPayment, 200.0);
        Payment bankTransferPayment = new BankTransferPayment();
        processor.processPayment(bankTransferPayment, 300.0);

        NotificationService service = new NotificationService();
        Notification smsnotification = new SmsNotification();
        service.SendNotification(smsnotification,"this is a new sms:)");
        Notification emailnotification = new EmailNotification();
        service.SendNotification(emailnotification,"this is a new email:}");
        Notification pushnotification = new PushNotification();
        service.SendNotification(pushnotification,"this is a new push notification ");

    }
}
