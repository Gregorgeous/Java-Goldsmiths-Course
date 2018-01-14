package com.company;

public class Exercise3{
    public static void main(String[] args) {
        int [] numbers = {1,100, 200, 300, 250, 216, 500,1000,400};
        System.out.println(duplicates(numbers));
    }
    public static boolean duplicates (int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i!=j){
                    return false;
                }
            }
        }
        return true;
    }
}
