package paymentSystem;
public class BasePayment {
    double amount;

    public BasePayment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing payment...");
    }
}
