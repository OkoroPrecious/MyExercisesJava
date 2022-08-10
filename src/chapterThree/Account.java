package chapterThree;

public class Account {

    /*Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
    Ensure that the withdrawal amount does not exceed the Account’s balance.
    If it does, the balance should be left unchanged and the method should print a message indicating
    "Withdrawal amount exceeded account balance." Modify class AccountTest (Fig. 3.9)
    to test method withdraw.
     */
        private String name;
        private double balance;

        public Account(String name, double balance){
            this.name = name;

             if (balance > 0.0) {
                this.balance = balance;
             }
        }
        public double getBalance() {
            return balance;
        }

        public void deposit(double depositAmount) {
            if (depositAmount > 0.0) {
                balance = balance + depositAmount;
            }
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void withdraw(double withdrawalAmount){
            if (withdrawalAmount > balance) {
                System.out.println("Withdrawal amount exceeded account balance.");
            }
            else
                balance = balance - withdrawalAmount;

        }

        public void displayAccount(Account accountToDisplay) {
            System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
        }

}
