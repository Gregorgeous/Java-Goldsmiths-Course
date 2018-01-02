package com.company;

public class Exercise2{
    public static void main(String[] args) {
        int [] numbers = {1,100, 200, 300, 250, 216, 500,1000,400};
        System.out.println(isSorted(numbers));
    }
    public static boolean isSorted(int [] a){
        int previousNum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (previousNum > a[i]) {
                System.out.println("At index " +i +" there is a smaller number, so ..");
                return false;
            }
            previousNum = a[i];
        }
        return true;
    }
}

