public class CheckingAccount extends Account{
    private int numberOfChecksUsed; // stores the number of checks used every month. Starts at zero.
    private double ATMTransactionFee = 1.00;
    public CheckingAccount(String id, double initialBalance){
        super(id, initialBalance);
    }
    public boolean withdraw(double amount){
        if (balance - amount - ATMTransactionFee >= 0 ){
            balance = balance - amount - ATMTransactionFee;
            return true;
        }else {
            System.out.println("Operation illegal: insufficient funds");
            return false;
        }
    }
    public void deposit(double amount){
        balance = balance + amount - ATMTransactionFee;
    }
    public void resetChecksUsed(){
        numberOfChecksUsed = 0;
    }
    public int getChecksUsed(){
        return numberOfChecksUsed;
    }
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
