package com.company;

public class MonthlySales {

    public static void main(String args[]){
//        We create an array of individual sales during the month
        double [] monthlySales= {50000.0 , 40000.1, 55000.0 ,30000.0,
                250000.2, 600000.2, 450000.0, 36000.0 ,28000.0, 15000.1, 700000.2,
                15000.0};
//        we initialize a total sale variable
        double totalSale = 0 ;
//        We create a loop which adds up every sale in the monthlySales array to the totalSale variable
        for (int i = 0; i < monthlySales.length; i++) {
            totalSale += monthlySales[i];
        }
        System.out.println("Total sale of the year 2016: ");
        System.out.println(totalSale);

//        We create an average - which is a total sale divided by how many sales was there
        double theAverage = totalSale/ monthlySales.length;
        System.out.println("The average sale of the year 2016: ");
        System.out.println(theAverage);

//        we check whats the smallest sale ..
//        firstly we initialize TheSmallestNum variable and set it to the first element of the monthlySales array.
        double theSmallestNum = monthlySales[0];
//        Then we loop through the MonthlySales array and compare every element with our current "theSmallestNum" value
        for (int i = 1; i < monthlySales.length; i++) {
//            the Math.min method for each element of the array compares the current "theSmallestNum" value with the i-th element of the array
            theSmallestNum = Math.min(theSmallestNum, monthlySales[i]);
//            If the i-th element is smaller than the the current "theSmallestNum" value, we assign it as the new "theSmallestNum". If not, we don't
        }
        System.out.println("The smallest number is :" + theSmallestNum);

//        Here we do exactly the same procedure as with the smallest num, but using the "max" method for the maximal number of the array.
        double theBiggestNum = monthlySales[0];
        for (int i = 1; i < monthlySales.length; i++) {
            theBiggestNum = Math.max(theBiggestNum, monthlySales[i]);
        }
        System.out.println("The biggest number is :" + theBiggestNum);
    }
}

