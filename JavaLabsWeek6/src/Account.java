public class Account {
//    Firstly, we create 3 class variables
//    We also set them initially to zero-like values, so that we don't need to handle all cases when there are "undefined" variable values in our constructors.
    String name = "";
    int accountNumber = 0;
    double Balance = 0.00;

//    Then we create a set of constructors. Depending on which one the user uses while instantiating the object, we set the corresponding values to the ones provided by user.
    Account(String s){
        this.name = s;
    }
    Account(String s, int n){
        this.name = s;
        this.accountNumber = n;
    }
    Account(String s, double b){
        this.name = s;
        this.Balance = b;
    }
    Account(String s, int n, double b){
        this.name = s;
        this.accountNumber = n;
        this.Balance = b;
    }

//    Below is a bunch of getters and setters - again, it follows exactly same principles as in the previous exercise.
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return Balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

//    This function gives as a feature to store any amount of money provided by the user via the argument.
    public double deposit (double d) {
//        we then sum up the current balance with the money provided ..
        this.Balance += d;
//        and then we return with a function showing the current balance
        return this.getBalance();
    }
//    Here we can withdraw money basing on 2 conditions ...
    public double withdraw (double w) {
//        if the amount we want to withdraw is MORE than we currently have on the account, we reject the operation and return with 0.
        if (w > this.Balance){
            System.out.println("Operation invalid: there's not enough funds on the accounts");
            System.out.println("Please, provide a proper amount to withdraw");
            return 0;
        }
//        Otherwise, we create a variable newBalance (which is current balance minus the amount to widthdraw) and then we call setBalance with the newBalance as an argument.
        else {
            double newBalance = this.Balance - w;
            this.setBalance(newBalance);
//            Finally, we return the amount of money that was withdrawn (which is just the same amount user has typed in).
            return w;
        }
    }

//    Finally, we override the standard ToString method with our own one.
    @Override
    public String toString() {
//        Here I just wanted to make it look fancy in the terminal so I made it as a bunch of String variables and at the bottom I returned a sum of them all
          String x1 ="--------------------------------------------------- \n";
          String a = "| this is your account information:                |\n";
          String b = "| your account name: " + "\"" + this.getName() +"\"    |\n";
          String c = "| your account number: " + this.getAccountNumber() + "                           |\n";
          String d = "| your account balance: £" + this.getBalance() + "                       |\n";
          String x2 = "--------------------------------------------------";
          return x1+a+b+c+d+x2;
    }

//    Then, we create a printAccount method - the only thing it does is it prints the result of "toString()" method so that we can just call our Account.printAccount() instead of calling it with system.out.print in the main method.
    void printAccount(){
        System.out.println(this.toString());
    }


//    And then finally we have our main method where we instantiate one account object and print it.
    public static void main (String[] args ) {
        Account myFirstAccount = new Account("My billionaire's account", 1, 5.50);
        myFirstAccount.printAccount();
    }
}
