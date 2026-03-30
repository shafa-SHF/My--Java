package paymentSystem;
public class PaymentApp {
    public static void main(String[] args) {

        BasePayment p1 = new CardPayment(1000);
        BasePayment p2 = new OnlinePayment(2000);
        BasePayment p3 = new DigitalPayment(3000);

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
