//import java.io.File;
//import java.io.IOException;
import java.io.*;
import java.util.*;
//import java.util.Objects;
//import java.util.Scanner;

public class WordOccurencesInFile {
    public static void main ( String[] args ) throws IOException {
//        From lines 11 - 15 we do exactly the same as in exercise one.
        Scanner usersFile = new Scanner(System.in);
        System.out.println("Please, enter any filename in this folder WITH it's extension:");
        String fileName = usersFile.next().trim();
        File theFile = new File (fileName);
        if (theFile.exists()) {
//        If the file exists, we ask the user for giving us the word they want to search for in the file.
        Scanner givenWord = new Scanner(System.in);
        System.out.println("Now enter a word:");
//        Again, we trim it, better be safe than sorry.
        String theString = givenWord.next().trim();
//        We instantiate a Scanner class giving the file as an argument.
        Scanner scan = new Scanner(theFile);
//        This is our counter variable.
        int wordOccurences = 0;
//        While there are any words/numbers left, we carry on ..
        while(scan.hasNext() )   // check for end of file
        {
//            .. and only if the current text is equal to the string given us by the user, we add +1 to the wordOccurences counter.
//              NB we can only use the .equals method of comparing, the '==' doesn't work for comparing string values.
            if (theString.equals(scan.next())){
                wordOccurences++;
            }
        }
//        At the end, we output the results.
        System.out.println("Number of occurrences of the word " + "\"" + theString + "\"" + " in this file: " + wordOccurences);
        }
//      Same as in the previous exercise.
        else{
            System.out.println("A file with a given filename doesn't exist in this workspace directory, rerun the program again, this time giving a correct file");
        }
    }
}
