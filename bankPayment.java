public class bankPayment extends Paymentt {
    private String AccountNumber;
    private String BankName;
    private String AccountReciept;
    private String BankReciept;

    public bankPayment(String BankName,String AccountNumber){
    this.AccountNumber=AccountNumber;
    this.BankName=BankName;
    this.AccountReciept="87900094922";
    this.BankReciept="BCA";
    }
    public void pay(double amount,int transactionID){
        System.out.println("the amount:"+ amount + "already paid for the transctionTD"+transactionID);
    //saving data in to databases
    System.out.println("the payment from"+ this.BankName+"and the account:"+ this.AccountNumber);   
    }
    
    
}



