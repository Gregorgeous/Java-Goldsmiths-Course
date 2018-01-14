public class SavingsAccount extends Account {
    public SavingsAccount(String id, double initialDeposit){
        super(id, initialDeposit);
        if (initialDeposit >= 1000){
            balance += 10;
        }
    }
    public boolean withdraw(double amount){
      double transactionFee = 3;
      if (balance - amount - transactionFee >= 10){
          balance = balance - amount - transactionFee;
          return true;
      }
      else {
          System.out.println("Operation not allowed: insufficient funds");
          return false;
      }
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double addInterest(double rate){
//        todo: figure out what's all about
        return 0;
    }
}
