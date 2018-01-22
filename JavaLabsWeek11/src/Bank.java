import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private double savingsInterestRate = 0.1;
    public Bank(){
        accounts = new ArrayList<Account>();
    }
    public int numberOfAccounts(){
        return accounts.size();
    }
    public void addAccount(Account a){
        accounts.add(a);
    }
    public Account getAccount(String accountID){
        for (Account acc : accounts) {
            if (acc.getID().equals(accountID)){
                return acc;
            }
        }
        return null;
//        int accountIndex = accounts.indexOf(Account.getID(accountID));
//        if (accountIndex == -1){
//            return null;
//        }else {
//            return accounts.get(accountIndex);
//        }

    }
    public boolean deposit(String accountID, double amount){
        Account targetAccount = this.getAccount(accountID);
        if (targetAccount == null){
            return false;
        }else {
            targetAccount.deposit(amount);
            return true;
        }
    }
    public boolean withdraw(String accountID, double amount){
        Account targetAccount = this.getAccount(accountID);
        if (targetAccount == null){
            return false;
        }else {
            return targetAccount.withdraw(amount);
        }
    }
    public boolean transfer(String fromAccountID, String toAccountID, double amount){
        Account targetAccount1 = this.getAccount(fromAccountID);
        Account targetAccount2 = this.getAccount(toAccountID);
        if (targetAccount1 == null || targetAccount2 == null){
            return false;
        }else {
            targetAccount1.withdraw(amount);
            targetAccount2.deposit(amount);
            return true;
        }
    }
    public void addInterest() {
        for (Account acc : accounts){
            boolean isSavingsAccount = acc instanceof SavingsAccount;
            if (isSavingsAccount) {
                SavingsAccount account = (SavingsAccount) acc;
                account.addInterest(savingsInterestRate);
            }
        }
    }
    public void reset(){
        for (Account acc : accounts){
            boolean isCheckingAccount = acc instanceof CheckingAccount;
            if (isCheckingAccount) {
                CheckingAccount account = (CheckingAccount) acc;
                account.resetChecksUsed();
            }
        }
    }

}
