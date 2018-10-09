package com.bojanlukic;

public class Main {

    public static void main(String[] args) {

        //prints the interest based on given amount and rate
        System.out.println("1000 at 5 % interest = " + calcInterest(1000, 5));
        System.out.println("1000 at 5 % interest = " + calcInterest(1000, 15));
        System.out.println("1000 at 5 % interest = " + calcInterest(1000, 10));

        //prints i up to 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("this i = " + i);
        }


        //EXERCISE 1
        //prints out the interest based on given amount and parameter j
        for (int j = 2; j <= 8; j++) {
            System.out.println("10,000 at " + j + "% interest = " + String.format("%.2f", calcInterest(10000, j)));
        }


        //EXERCISE 2
        //prints out the interest based on given amount and parameter a
        for (int a = 5; a > 1; a--) {
            System.out.println("200 at " + a + "% interest = " + String.format("%.2f", calcInterest(200, a)));
        }


    }

    //calculates the interest based on given amount and rate
    public static double calcInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
