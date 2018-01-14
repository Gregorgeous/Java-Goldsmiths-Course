package com.company;

public class Exercise4 {
    public static void main(String[] args) {
        primeNumbers(100);
    }

    public static void primeNumbers(int n) {
        if (n < 2) {
            System.out.println("There are no prime numbers under " + n );
        }
        else {
            System.out.println("The prime numbers from 1 to " + n + " are:");
            boolean isPrime = true;
            for (int num = 2; num < n; num++) {
                for (int divisor= 2; divisor < num; divisor++ ){
                    if (num % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.println(num);
                }
                else {
                    isPrime = true;
                }
            }
        }
    }
}
