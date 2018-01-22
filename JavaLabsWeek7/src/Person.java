import java.util.Date;
import java.text.*;

public class Person {
//    We create class variables
    String name;
    Date DoB;
//    We create a SimpleDateFormat object which will display our date in a clearer way.
    public SimpleDateFormat dob = new SimpleDateFormat("dd/MM/yyyy");
//    This is the constructor
    public Person (String n, Date d) {
        this.name = n;
        this.DoB = d;
    }

//    this is the method age, it takes a Date object..
    public int age (Date someDate){
//        .. then it takes a current year (yes, this is a deprecated method, but I was allowed by Lahcen to use it)
        int currentYear =  new Date().getYear();
//        Then it extracts the year information from the date object
        int givenYear =  (int) someDate.getYear();
//        and finally it returns an age, which is a subtraction of the year a person was born with the current year.
        return currentYear - givenYear;
    }

//    Here we override a default toString method
    public String toString (){
//        Note I use the dob.format where I put the Dob date class variable to make it displayed in a nice formatted way without an information about the hour and day
        return "This person name is: " + this.name + "\n their date of birth is: " + this.dob.format(this.DoB);
    }
}
