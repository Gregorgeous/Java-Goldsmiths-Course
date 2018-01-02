public class InvoiceItem {
//    Firstly we create a set of class variables (in the future, these variables should have a private access modifier)
//    Those variable will be instantiated along with every instantiation of our class.
    int id;
    String description;
    int quantity;
    double unitPrice;
//    We also create one static variable "counter". This one will be created in the memory only once, not instantiated like the rest of the variables.
    static int counter;

//    This is our constructor. I deliberately didn't create any other polymorphism of our constructor. I only want this class to be instantiated with all variables explicitly defined.
    InvoiceItem(int uId, String uDescr, int uQuant, double uUnitP){
//        Whenever we execute the constructor (once for any new instantiation of the class), we want to add +1 to our counter static variable.
//        This way, we keep a track of how many new objects are are created from our class.
        counter += 1 ;
//        The rest is just setting the class variables with the value of user given arguments.
        this.id = uId;
        this.description = uDescr;
        this.quantity = uQuant;
        this.unitPrice = uUnitP;
    }
//    These are a set of simple getters of the value (as this is considered a good practice not to call the class variable directly, as normally they are private)
    int getId(){
        return this.id;
    }
    String getDescription(){
        return this.description;
    }
    int getQuantity(){
        return this.quantity;
    }
    double getUnitPrice(){
        return this.unitPrice;
    }

//    This is a setter - it sets a price of the unit in the invoice with the value passed by the user.
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

//    Here we override the standard "toString" method with our own one.
    public String toString(){
        return "\"InvoiceItem[id=" + this.id + ", description= " + "\"" + this.description + "\"" + ", quantity=" + this.quantity + ", uniPrice= £" +  +this.unitPrice + "]\" ";
    }

//    Finally, we have our main method where we instantiate a new object from class and print it.
    public static void main (String[] args ) {
        InvoiceItem invoiceOne = new InvoiceItem(1, "this is invoice one ", 20 , 40.5);
        System.out.println(invoiceOne.toString());
        //    You can also check how many objects from the class there are by calling
//        System.out.println(InvoiceItem.counter);
    }
}
