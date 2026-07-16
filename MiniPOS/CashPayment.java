package MiniPOS;

class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Cash Payment: " + amount);
    }
}
