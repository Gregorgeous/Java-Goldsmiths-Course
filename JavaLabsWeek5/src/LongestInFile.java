import java.io.*;
import java.util.Scanner;

public class LongestInFile {
    public static void main ( String[] args ) throws IOException{
//        From lines 7 - 11 we do exactly the same as in previous exercises at the beginning..
        Scanner usersFile = new Scanner(System.in);
        System.out.println("Please, enter any filename in this folder WITH it's extension:");
        String fileName = usersFile.next().trim();
        File theFile = new File (fileName);
        if (theFile.exists()) {
//            Same as before ..
            Scanner scan = new Scanner(theFile);

//            Here we initialise theLongestWord String, initially empty
//              NB yes, I know Strings are immutable and the algorithm could be more efficient with StringBuilder, I decided to go with only String for the purpose of the exercise though, as the test input is very small.
            String theLongestWord = "";
            while(scan.hasNext())   // check for end of file
            {
//                If ever the current string in the file is longer than our theLongestWord String, then we replace it (or actually, initialise new theLongestWord String obj with the new value)
                if (scan.next().length() > theLongestWord.length()){
                    theLongestWord = scan.next();
                }
//               NB it works even if there is a number, as it parses it to string, so there's no crash when calling the method .length() on a number.
            }
//            We output the results
            System.out.println("the longest word in a given file is : " + theLongestWord);
        }
//        Same as in previous exercises
        else{
            System.out.println("A file with a given filename doesn't exist in this workspace directory, rerun the program again, this time giving a correct file");
        }
    }
}
