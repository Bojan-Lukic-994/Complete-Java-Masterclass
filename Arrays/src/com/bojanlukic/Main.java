package com.bojanlukic;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*

        //initiates new array
        int[] someNumbers;

        //initiates the number of elements
        someNumbers = new int[5];

        //initiates the number at element 0 and prints it
        someNumbers[0] = 10;
        System.out.println(someNumbers[0]);


        //initiates new array (double) - with 3 values
        double[] doubleArray = new double[3];
        doubleArray = new double[]{10, 20, 30};
        //prints the third! value
        System.out.println(doubleArray[2]);


        //initiates the thirdArray of integers and prints the first number
        int[] thirdArray = {50, 60};
        System.out.println(thirdArray[0]);


        //example - creating new array using method
        int[] exerciseAray = {10, 20, 30, 40, 50, 60, 70};
        printArrayValue(exerciseAray);




         //another way to initiate array - using new method
         public static void printArrayValue(int[] array) {
         for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
         }
        */


        //example with using Scanner
        int[] someIntegers = getIntegers(5);
        for (int i = 0; i < someIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + someIntegers[i]);
        }

    }


    //example using Scanner - method that gets the values of an array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(scanner.nextLine());
        }
        return values;
    }


}
