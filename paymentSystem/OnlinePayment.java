package paymentSystem;
public class OnlinePayment extends BasePayment {

    public OnlinePayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Paid " + amount + " using Online Payment");
    }
}