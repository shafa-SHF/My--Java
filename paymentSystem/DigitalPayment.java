package paymentSystem;
public class DigitalPayment extends BasePayment {

    public DigitalPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Paid " + amount + " using Digital Payment");
    }
}