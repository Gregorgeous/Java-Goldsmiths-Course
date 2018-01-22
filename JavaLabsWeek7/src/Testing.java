import java.text.*;
import java.util.Date;

public class Testing {

    public static void main (String []args) {
        Date result = null;
        String ourDate = "16-06-1997";
//      Here I use just the same thing as in person, a simple date format with a pattern below
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            result  = dateFormat.parse(ourDate);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        if (result != null){

//            from here we test 1st method
            System.out.println("---------testing 1st method----------");
            Person test1 = new Person("Adam", result);
            System.out.print("your age is: ");
            System.out.print(test1.age(result));
            System.out.print("\n");
            System.out.println(test1.toString());


//            from here we test 2nd method
            System.out.println("---------testing 2nd method----------");
            double [] grades = {67.00,87.00,60.00,70.00,88.00};
            Student test2 = new Student("10", grades , "Adam", result);
//            Test of getFinalMark method:
            System.out.println(test2.getFinalMark());
//            Test of getGrades() method:
            System.out.println(test2.getGrade());
//            Test of the whole thing:
            System.out.println(test2.toString());

//            from here we test 3rd method
            System.out.println("---------testing 3rd method----------");
            UndergraduateStudent test3 = new UndergraduateStudent(2, "Computer Science 2","10", grades , "Adam", result);
//            Test of getFinalMark method:
            System.out.println(test3.getFinalMark());
//            Test of getGrades() method:
            System.out.println(test3.getGrade());
//            Test of the whole thing:
            System.out.println(test3.toString());


        }

    }
}
