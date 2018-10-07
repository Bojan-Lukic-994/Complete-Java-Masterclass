package com.bojanlukic;

public class Main {

    public static void main(String[] args) {

        //prints out the day of the week
        printDayOfTheWeek(15);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);

    }

    private static void printDayOfTheWeek(int day) {

                   //Solution using if else

        if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }



                   //Solution using switch

    /*    switch (day) {

            //checks if the day is Monday
            case 0:
                System.out.println("Monday");
                break;

            //checks if the day is Tuesday
            case 1:
                System.out.println("Tuesday");
                break;

            //checks if the day is Wednesday
            case 2:
                System.out.println("Wednesday");
                break;

            //checks if the day is Thursday
            case 3:
                System.out.println("Thursday");
                break;

            //checks if the day is Friday
            case 4:
                System.out.println("Friday");
                break;

            //checks if the day is saturday
            case 5:
                System.out.println("Saturday");
                break;

            //checks if the day is Sunday
            case 6:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }                        */

    }
}
