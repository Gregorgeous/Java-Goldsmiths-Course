package com.company;

public class Exercise1{
    public static void main(String[] args) {
        String [] stringArray = {"computing", "at ","Goldsmiths", "College",
                "University", "of", "London", "New Cross", "London","SE14 6NW"};
        System.out.println(longestStringInArray(stringArray)); // this should print university.
    }
    public static String longestStringInArray(String [] a){
        String longestString = a[0];
        boolean noLongest =false;
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() == longestString.length()){
                noLongest = true;
            }
            if (a[i].length() > longestString.length()){
                longestString = a[i];
            }
        }
        if (noLongest){
            return "There were multiple strings with the longest length, one of those was: " + "\"" +  longestString + "\"";
        }
        else return longestString;
    }
}
