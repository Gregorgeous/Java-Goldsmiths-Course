public class CheckingAccount extends Account{
    private int numberOfChecksUsed; // stores the number of checks used every month. Starts at zero.
    private double ATMTransactionFee = 1.00; // (Exercise requirement) transaction fee for a normal (atm) withdraw and deposit methods.
//    Constructor calling its super, abstract class
    public CheckingAccount(String id, double initialBalance){
        super(id, initialBalance);
    }
//    Same as in Saving account, check if operation possible, and do it returning true, otherwise log an error and return false.
    public boolean withdraw(double amount){
        if (balance - amount - ATMTransactionFee >= 0 ){
            balance = balance - amount - ATMTransactionFee;
            return true;
        }else {
            System.out.println("Operation illegal: insufficient funds");
            return false;
        }
    }
//    Deposit money minus a transaction fee applying for that in this type of account.
    public void deposit(double amount){
        balance = balance + amount - ATMTransactionFee;
    }
//    method can be called e.g. by bank class. Resets the num of checks used for this (or next) month.
    public void resetChecksUsed(){
        numberOfChecksUsed = 0;
        System.out.println("Checking account: " + this.id + " -> reset num of checks used");
    }
//    Simple getter
    public int getChecksUsed(){
        return numberOfChecksUsed;
    }
//    Withdraw, but usin a check. You have 3 checks usages for free (first condition), then widthraw using checks costs £2. Again, in the inner condition of both upper if's we check if operation is not "illegal".
    public boolean withdrawUsingCheck(double amount){
        if (numberOfChecksUsed <= 3){
            if (balance - amount >= -10){
                numberOfChecksUsed++;
                balance = balance - amount;
                return true;
            }else {
                System.out.println("Operation illegal: insufficient funds");
                return false;
            }
        }
        else {
            double checkWithdrawalFee = 2.00;
            if (balance - amount - checkWithdrawalFee >= -10){
                numberOfChecksUsed++;
                balance = balance = amount = checkWithdrawalFee;
                return true;
            }else {
                System.out.println("Operation illegal: insufficient funds");
                return false;
            }
        }

    }
}
