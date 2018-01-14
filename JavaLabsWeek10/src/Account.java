public abstract class Account {
    protected String id; // stores account ID
    protected double balance; // stores the account balance
    public Account(String id, double balance) {
    this.id = id;
    this.balance = balance;
    } // initialise attributes
    public String getID() {
        return id;
    } //returns the account id
    public double getBalance(){
        return balance;
    };// returns the account balance
    public String toString(){
        return "Id: " + id + ", balance: " + balance;
    }; // returns a string that contains the id and balance
    public abstract boolean withdraw(double amount); // abstract method to be implement by sub-classes
    public abstract void deposit(double amount);// abstract method to be implement by sub-classes
}
