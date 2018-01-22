package com.company;


public class Tax {
    public static void main(String args[]){
//        We create those bunch of constants  which are supposed to be our bounds.
        final int firstSalaryCap = 15000;
        final int secondSalaryCap = 30000;
        final int thirdSalaryCap = 50000;
        final double firstTax = 0;
        final double secondTax= 0.05;
        final double thirdTax = 0.1;
        final double fourthTax = 0.2;

//        We initialize and assign an example salary.
        double mySalary = 60000;

//        If the salary is any bigger or any smaller then in one of the conditions, a right condition is executed.
        if (mySalary <= firstSalaryCap) {
            double theActualTax = mySalary*firstTax;
            System.out.println("Your tax is equal to: " + theActualTax + " pounds");
        }
        else if (mySalary > firstSalaryCap && mySalary <= secondSalaryCap) {
            double theActualTax = mySalary*secondTax;
            System.out.println("Your tax is equal to: " + theActualTax + " pounds");
        }
        else if (mySalary > secondSalaryCap && mySalary <= thirdSalaryCap) {
            double theActualTax = mySalary* thirdTax;
            System.out.println("Your tax is equal to: " + theActualTax + " pounds");
        }
        else if (mySalary > thirdSalaryCap) {
            double theActualTax = mySalary*fourthTax;
            System.out.println("Your tax is equal to: " + theActualTax + " pounds");
        }


    }
}
