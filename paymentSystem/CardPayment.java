package paymentSystem;
public class CardPayment extends BasePayment {

    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Paid " + amount + " using Card");
    }
}
