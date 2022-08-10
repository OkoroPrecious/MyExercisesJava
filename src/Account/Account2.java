package Account;

public class Account2 {
    private final String firstName;
    private final String lastName;
    private double balance;
    private double bankCharges = 1.25;


    public Account2(String firstName, String lastName, double balance, String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public void getBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }
    public void receivesTransfer(double transferAmount){
        balance += transferAmount;
    }
    public void transfer(double sendTransfer){
        balance -= (sendTransfer + bankCharges);
    }
}
