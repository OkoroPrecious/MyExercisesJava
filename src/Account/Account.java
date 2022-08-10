package Account;

public class Account {
    //private final String firstName;
   // private final String lastName;
    //private final String pin;
    private String accountNumber;
    private double balance;
    private double deposit;
    private double withdraw;
    private double bankTransfer = 1.25;

    public Account(String firstName, String lastName, double balance, String pin){

    }

    public void balance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public double deposit(String accountNumber, double depositAmount){
        balance += depositAmount;
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void transfer(double sendAmount){
        balance -= (sendAmount + bankTransfer);
    }

    public void receivesTransfer(double receiveAmount){
        balance += receiveAmount;
    }

    public void withdraw(int withdrawAmount, String pin) {
        balance -= withdrawAmount;
    }
}


