package MiniPOS;

class BankTransferPayment extends Payment {

    public BankTransferPayment(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Bank Transfer Payment: " + amount);
    }
}
