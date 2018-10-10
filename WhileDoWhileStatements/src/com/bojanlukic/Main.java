package com.bojanlukic;

public class Main<num> {

    public static void main(String[] args) {

 /*       int sum = 0;

        //while loop - prints out sum parameter until it is equal to 3
        while (sum != 3) {
            System.out.println("sum = " + sum);
            sum++;
        }

        //infinite loop
        while (true) {
            System.out.println("sum = " + sum);
            sum++;
        }

        //do while loop
        do {
            System.out.println("sum was = " + sum);
            sum++;

            if (sum > 10) {
                break;
            }
        } while (sum != 6);
                                    */

                                //EXERCISE

        int num = 5;
        int finishNum = 10;
        int evenFounded = 0;

        //checks out which numbers from 4 to 10 are even
        while (num <= finishNum) {
            num++;
            if(!isEven(num)) {
                evenFounded++;
                continue;
            }

            //prints out even numbers
            System.out.println("Even number = " + num);

        }

        //prints out the number of founded even numbers
        System.out.println("Even numbers founded = " + evenFounded);

    }

        public static boolean isEven (int num) {

        //checks if the number is even
        if ((num % 2) == 0) {
            return true;
        }else {
            return false;
        }
        }






}
