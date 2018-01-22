public class SavingsAccount extends Account {
//    Constructor initialising all class variables.
    public SavingsAccount(String id, double initialDeposit){
        super(id, initialDeposit);
        if (initialDeposit >= 1000){
            balance += 10;
        }
    }
//    Method allows to withdraw money but with a transaction fee applied to this type of bank account
    public boolean withdraw(double amount){
      double transactionFee = 3;
//      We check if the final amount of money after withdrawing and applying the fee is no less than £10 (exercise's requirement)
      if (balance - amount - transactionFee >= 10){
//          If so, update new balance of the account and return true
          balance = balance - amount - transactionFee;
          return true;
      }
//      Otherwise, print a message and return false.
      else {
          System.out.println("Operation not allowed: insufficient funds");
          return false;
      }
    }
//    Self-explanatory
    public void deposit(double amount) {
        balance += amount;
    }
//  Here we take a value of the balance, calculates new balance with an interest rate provided and updates the account balance with a new value. Returns the updated account balance value.
    public double addInterest(double rate){
        double balance = getBalance();
        this.balance= balance + balance*rate;
//        This message below is only for testing purposes when you call the method in main so that you see something is actually happening.
        System.out.println("I added interest to savings account : " + this.id + ". Was: " + balance + ", now is: " + this.balance);
        return this.balance;
    }
}
