import java.util.*;

// First, I inherit the Person class by "extends"
public class Student extends Person {
//    I create 2 class variables
    String studentID;
    double[] marks = new double[5];

//    This is my constructor, I involve all the previous arguments neccessary by the previous class(es)
    public Student (String sID , double[] m, String n, Date d) {
//        I use the word "Super" to call the constructor from Person
        super(n, d);
        this.studentID = sID;
        this.marks = m;
    }

//    This method creates a collector double summedMarks which is summed after the loops goes over the whole marks array.
    public double getFinalMark (){
        double summedMarks = 0;
        for (int i = 0; i < this.marks.length; i++) {
            summedMarks += this.marks[i];
        }
//        and then returns the average
        return summedMarks/this.marks.length;
    }

//    Very simple class; whatever the mark (which is just same value as a result of this.getFinalMark) is, return the grade it should be
    public String getGrade(){
        double mark = this.getFinalMark();
        if (mark >= 70 ){
            return "A";
        }
        else if (mark >= 60 && mark < 70){
            return "B";
        }
        else if (mark >= 50 && mark < 60){
            return "d";
        }
        else {
            return "F";
        }
    }
    public String toString (){
        double mark = this.getFinalMark();
        return "This person name is: " + this.name + "\n their date of birth is: " + this.dob.format(this.DoB) + "\n they're a student with student ID: " + this.studentID + "\n .. and a final mark equal:" + mark;
    }
}
