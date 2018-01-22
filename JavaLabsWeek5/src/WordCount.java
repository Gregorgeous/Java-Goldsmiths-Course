import java.io.*;
import java.util.Scanner;

public class WordCount {
    public static void main ( String[] args ) throws IOException{
//        Firstly, we create a Scanner obj for storing user's given filename
        Scanner usersFile = new Scanner(System.in);
        System.out.println("Please, enter any filename in this folder WITH it's extension:");
//        We do it by calling the .next() method on the scanner obj. Additionally, we also trim the input from trailing and leading spaces, to avoid possible error linked with that.
        String fileName = usersFile.next().trim();
//        We instantiate a File class, passing the file name given by the user.
        File theFile = new File (fileName);
//        Here we check if the file exists, if it is not, we ask the user to rerun the program and input the right file
        if (theFile.exists()) {
//         If condition is met, we instantiate a Scanner class giving the file as an argument.
        Scanner scan = new Scanner(theFile);

//        We initialize our int numOfWords counting the number of the words in the document
//            NB it will also count any number as a string and I believe this is a good behaviour of the program, mostly user would want any numbers to be counted as "words" as well.
        int numOfWords = 0;
        System.out.println("The words in the document are following:");
//        While the there are any "variables" (be it a string, int or any other..)
        while(scan.hasNext())   // check for end of file
        {
//            Firstly, output the word (because why not, it's an additional feature of the program :) )
            System.out.println(scan.next());
//            and then add it up to our counter.
            numOfWords++;
        }
//        After all, output the number of the words in the document.
        System.out.println("Number of words in this file: " + numOfWords);
        }
//        BELOW already mentioned on line 13.
        else{

            System.out.println("A file with a given filename doesn't exist in this workspace directory, rerun the program again, this time giving a correct file");
        }
    }
}
