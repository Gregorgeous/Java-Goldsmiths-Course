import java.util.Date;

public class UndergraduateStudent extends Student{
    int year;
    String program;
// same as previous
    public UndergraduateStudent (int y, String p, String sID , double[] m, String n, Date d) {
        super(sID,m,n,d);
        this.year = y;
        this.program = p;
    }

//    This is tricky
    public double getFinalMark (){
//        I create a top3 marks array to store top 3 marks;
        double[] top3Marks = new double[3];
//        then I create a tempArray
        double[] tempArray = new double[5];
//        .. into where I copy the values of our marks array (I don't want to override values of the this.marks)
        for (int i = 0; i < this.marks.length; i++) {
            tempArray[i] = this.marks[i];
        }
//        for 3 times  ..
        for (int i = 0; i < 3; i++) {
//            in each iteration find the current best mark
            double currentBestMark = 0;
//            I create also the indexToCountOut
            int indexToCountOut = tempArray.length +1 ;
//            I go through the whole array of grades and find the highest
            for (int j = 0; j < tempArray.length; j++) {
                if (currentBestMark < tempArray[j]){
                    currentBestMark = tempArray[j];
//                    I also store at which index it was
                    indexToCountOut = j;
                }
            }
//            and when I found it, I make the value of the highest mark at that index to -1 to drop it out of consideration for next iterations
            if (indexToCountOut < tempArray.length){
                tempArray[indexToCountOut] = -1;
            }
//            finally I store it at top3 marks at that iteration.
            top3Marks[i] = currentBestMark;
        }


// then I iterate trough top 3 marks and sum it all up
        double sumOfTopMarks = 0;
        for (int i = 0; i < top3Marks.length; i++) {
            sumOfTopMarks += top3Marks[i];
        }
//        and return the average of those 3 marks
        return sumOfTopMarks/top3Marks.length;
    }

//    Easy, same as the previous with some addition of 1 mark
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
        else if (mark >= 40 && mark < 50){
            return "pass";
        }
        else {
            return "Fail";
        }
    }
//    Also same, but with more details ..
    public String toString (){
        double mark1 = super.getFinalMark();
        double mark2 = this.getFinalMark();
        return "This person name is: " + this.name + "\n their date of birth is: " + this.dob.format(this.DoB) + "\n they WERE a student with student ID: " + this.studentID + "\n .. and a final mark FROM 6TH FORM:" + mark1 +"\n now they're undergraduate students on year:" + this.year + "\n... studying:" + this.program + "\n .. with a mark:" + mark2;
    }
}
