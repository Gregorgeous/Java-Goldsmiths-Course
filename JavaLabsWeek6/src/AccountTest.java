public class AccountTest {
    public static void main (String[] args ) {
//        Below we just instantiate a new object from the class and then we call all the methods and so on .. Nothing to really explain
    Account myTestAccount = new Account("my super test account", 1, 50.00);
        System.out.println(myTestAccount.getName());
        System.out.println(myTestAccount.getAccountNumber());
        System.out.println(myTestAccount.getBalance());
        myTestAccount.setName("Can I change my account name ? I don't want to put 50 quid just for testing ..");
        System.out.println(myTestAccount.getName());
        myTestAccount.setName("Oh,damn! I don't want to have that long account name!");
        System.out.println(myTestAccount.getName());
        myTestAccount.setName("My super account");
        myTestAccount.setBalance(30.50);
        myTestAccount.setAccountNumber(2);
        System.out.println(myTestAccount.getName());
        System.out.println(myTestAccount.getAccountNumber());
        System.out.println(myTestAccount.getBalance());
        myTestAccount.deposit(10.50);
        myTestAccount.withdraw(10.50);
        myTestAccount.withdraw(100.50);
        myTestAccount.printAccount();

    }
}

