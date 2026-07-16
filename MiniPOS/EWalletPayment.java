package MiniPOS;

class EWalletPayment extends Payment {

    public EWalletPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("E-Wallet Payment: " + amount);
    }
}
