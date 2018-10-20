package com.bojanlukic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //User can input name, year of birth and they get print out
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of birth: ");

        //checks if the next input is number (integer)
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int birthYear = scanner.nextInt();

            //handles the next line character
            scanner.nextLine();
            //asks for user name
            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            int age = 2018 - birthYear;
            //checks if age parameter is between 0 and 100 (inclusive)
            if (age >= 0 && age <= 100) {
                System.out.println("Name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid birth year.");
            }

        } else {
            System.out.println("Unable to add birth year");
        }

        scanner.close();
    }
}
