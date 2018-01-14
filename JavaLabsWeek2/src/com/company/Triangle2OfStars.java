package com.company;

public class Triangle2OfStars {
    public static void main(String args []){
        int i;
        int j;
        for(i=1; i<=6; i++) {
            for ( j = 1; j<= i; j++ ) {
                System.out.print( "*" );
            }
            System.out.println();
        }
        for(i=6; i>0; i--) {
            for ( j = 1; j<= i; j++ ) {
                System.out.print( j );
            }
            System.out.println();
        }
    }
}

