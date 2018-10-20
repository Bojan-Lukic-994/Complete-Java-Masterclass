package com.bojanlukic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //initiates parameters count and sum
        int count = 0;
        int sum = 0;

        //asks user to input the next number, until count is bigger than 10
        while (count < 10) {
            int nextCount = count + 1;
            System.out.println("Enter number #" + nextCount + ":");

            //checks if given number is an integer
            boolean isInteger = scanner.hasNextInt();
            if (isInteger) {
                int number = scanner.nextInt();
                count++;
                sum = sum + number;

                //if number is not an integer, prints out the given message
            } else {
                System.out.println("Invalid number");
            }

            //handles end of line
            scanner.nextLine();
        }


        System.out.println("Sum of all numbers is = " + sum);
        scanner.close();
    }
}
