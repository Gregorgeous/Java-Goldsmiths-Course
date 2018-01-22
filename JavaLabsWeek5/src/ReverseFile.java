import java.io.*;
import java.util.Scanner;

public class ReverseFile {
    public static void main ( String[] args ) throws IOException{
//        Again, same thing as in previous exercises, this time we do it twice, firstly for the first file, then for the second
        Scanner usersFile1 = new Scanner(System.in);
        System.out.println("Please, enter an INPUT text file in a 'filename.txt' format:");
        String fileName1 = usersFile1.next().trim();
        File theFile1 = new File (fileName1);
        Scanner usersFile2 = new Scanner(System.in);
        System.out.println("Please, enter an OUTPUT text file in a 'filename.txt' format:");
        String fileName2 = usersFile2.next().trim();
        File theFile2 = new File (fileName2);
//      Again, we check if (this time two, not one) files exist.
        if (theFile1.exists() && theFile2.exists()) {
//            If so , we instantiate new Scanner obj with the INPUT file as an argument.
            Scanner scan = new Scanner(theFile1);
//            Now, we create a StringBuilder, it's gonna store our whole text from the input file.
            StringBuilder wholeSentence = new StringBuilder();
            while(scan.hasNext())   // check for end of file
            {
//                While in file, firstly we append the string "scanned" from the file to our StringBuilder obj.
                wholeSentence.append(scan.next());
//                We also want to have it with proper whitespaces between the words, so whenever there's still more words next in the file , we append a whitespace to our StringB obj.
                if (scan.hasNext()){
                    wholeSentence.append(" ");
                }
            }
//            This is our result, you can comment it out.
//            System.out.println("Our whole source input : " + wholeSentence);
//            Now, we put the result value to a newly created String (as we won't change it's value anymore)
            String sourceInput = wholeSentence.toString();
//            Then we create a new StringBuilder which is going to form the reversed string of our sourceInput.
            StringBuilder newSentence = new StringBuilder();
//            So we go trough the sourceInput String in a backward loop (so, from the end to the beginning)
            for (int i = sourceInput.length()-1 ; i >= 0; i--) {
//                and append each character to our new StringBuilder obj.
                newSentence.append(sourceInput.charAt(i));
            }
//            At the end we print the output here ...
            System.out.println("the output : " + newSentence);
//          ... but also we create instantiate a PrintWriter class via which we save the result to the second file (output.txt)
            PrintWriter printToOutput = new PrintWriter(theFile2);
            printToOutput.print(newSentence);
            printToOutput.close();

        }

        else{
            System.out.println("One or both of the given files doesn't/don't exist, rerun the program again, this time giving correct files");
        }
    }
}
