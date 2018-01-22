public class main {
    public static void main (String args[]){
        Bank bank = new Bank();
        Account a1 = new SavingsAccount("s1", 20);
        Account a2 = new SavingsAccount("s2", 30);
        Account a3 = new SavingsAccount("s3", 50);
        Account a4 = new CheckingAccount("c1", 200);
        Account a5 = new CheckingAccount("c2", 600);
        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        bank.addAccount(a4);
        bank.addAccount(a5);
        bank.addInterest();
        bank.reset();

    }
}
