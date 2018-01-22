import java.util.ArrayList;

// A class managing the account classes.
public class Bank {
//    Initialising arraylist of accounts.
    private ArrayList<Account> accounts;
//    Creating savingsInterestRate class variable (value is a percentage)
    private double savingsInterestRate = 0.1;
//    Constructor function where we initialise accounts arraylist.
    public Bank(){
        accounts = new ArrayList<Account>();
    }
//    return num of accounts
    public int numberOfAccounts(){
        return accounts.size();
    }
//    add account to arraylist.
    public void addAccount(Account a){
        accounts.add(a);
    }
//    Traverse through arraylist of accounts and return the first account matching accountID you have provided. If nothing found, return null.
    public Account getAccount(String accountID){
        for (Account acc : accounts) {
            if (acc.getID().equals(accountID)){
                return acc;
            }
        }
        return null;
    }
//    Deposit money from bank's perspective - provide accountID of an account you want to deposit money.
//    Then find this account calling "getAccount" method above.
//    If found , deposit money, otherwise return false.
    public boolean deposit(String accountID, double amount){
        Account targetAccount = this.getAccount(accountID);
        if (targetAccount == null){
            return false;
        }else {
            targetAccount.deposit(amount);
            return true;
        }
    }
//    Same as deposit but here in successful case we return a result of targetAccount.withdraw method (method's true or false results is dependent on inner conditions there)
    public boolean withdraw(String accountID, double amount){
        Account targetAccount = this.getAccount(accountID);
        if (targetAccount == null){
            return false;
        }else {
            return targetAccount.withdraw(amount);
        }
    }
//  same as withdraw but with an extra condition if withdraw was successful first.
    public boolean transfer(String fromAccountID, String toAccountID, double amount){
        Account targetAccount1 = this.getAccount(fromAccountID);
        Account targetAccount2 = this.getAccount(toAccountID);
        if (targetAccount1 == null || targetAccount2 == null){
            return false;
        }else {
            boolean withdrawSuccess = targetAccount1.withdraw(amount);
            if (withdrawSuccess){
                targetAccount2.deposit(amount);
                return true;
            }
            else {
                return false;
            }

        }
    }
//    Here we need to add interest to those accounts in the arraylist that are specifically SavingsAccount...
    public void addInterest() {
//        thus I iterate through the accounts arraylist
        for (Account acc : accounts){
//            and check if the current element in the arraylist is an instanceof SavingsAccount.
            boolean isSavingsAccount = acc instanceof SavingsAccount;
//            if it is, then I pass the reference of it to a new SavingsAccount variable..
            if (isSavingsAccount) {
                SavingsAccount account = (SavingsAccount) acc;
//                .. and then I call "addInterest" method on this variable (and as it's only a reference, it's actually the original class in the arraylist that's changed which is what I want)
                account.addInterest(savingsInterestRate);
            }
//            NB I can't just call "acc.addInterest()" as the abstract class Account doesn't have the addInterest() method.
//            Same,  I can't just call acc.addInterest() as it causes compile-time error because it treats all elements acc in the accounts array as of Account class.
        }
    }
//    Here I do just the same mechanism as for addInterest but this time for CheckingAccount
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
