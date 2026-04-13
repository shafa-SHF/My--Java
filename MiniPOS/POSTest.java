package MiniPOS;

public class POSTest {
    public static void main(String[] args) {

        // Payments (POLYMORPHISM)
        Payment p1 = new CashPayment(100);
        Payment p2 = new EWalletPayment(200);
        Payment p3 = new BankTransferPayment(300);

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();

        // Notifications (INTERFACE)
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        email.send("Payment done");
        sms.send("Payment done");
        push.send("Payment done");
    }
}
