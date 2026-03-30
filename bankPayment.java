public class bankPayment extends Paymentt {
    private String AccountNumber;
    private String BankName;
    private String BankReciept;

    public bankPayment(String BankName,String AccountNumber){
    this.AccountNumber=AccountNumber;
    this.BankName=BankName;
    this.AccountReciept="87900094922";
    this.BankReciept="BCA";
    }
    public void pay(double amount,int transactionID){
        System.out.println("the amount:"+ amount + "already paid for the transctionTD"+transactionID);
        //savind data in to databases
    System.out.println("The payment from"+this.BankName+"nd the account"+this.AccountNumber);
    }
    
    public String getBankReciept(){
        return this.BankReciept;
    }
}



