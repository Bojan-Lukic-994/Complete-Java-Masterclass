package com.bojanlukic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class AroundTheWorld {

    public static void main(String[] args) {

        //creates new linked list - countries
        LinkedList<String> countries = new LinkedList<String>();

        //adds countries to the linked list "countries"
        ordedInCountries(countries, "France");
        ordedInCountries(countries, "Belgium");
        ordedInCountries(countries, "Italy");
        ordedInCountries(countries, "Sweden");
        ordedInCountries(countries, "Cuba");

        //prints out the countries in alphabetical order
        //   printCountries(countries);

        //adds new countries to the linked list "countries:
        ordedInCountries(countries, "Norway");
        ordedInCountries(countries, "Argentina");

        //prints out the countries in alphabetical order
        printCountries(countries);
        chose(countries);

        /*
        //adds new countries to the linked list
        countries.add("France");
        countries.add("Belgium");
        countries.add("Italy");
        countries.add("Sweden");
        countries.add("Cuba");


        //prints out the countries to visit
        printCountries(countries);

        //adds another country to visit
        countries.add(2, "Holland");

        //prints out the countries to visit
        printCountries(countries);

        //removes the country at position 4
        countries.remove(4);

        //prints out the countries to visit
        printCountries(countries);

        */

    }

    //method that prints out next country to visit
    private static void printCountries(LinkedList<String> listToPrint) {
        Iterator<String> i = listToPrint.iterator();
        while (i.hasNext()) {
            System.out.println("Next country to visit is " + i.next());
        }

        //prints the gap between the lists
        System.out.println("-------------------------------");
    }


    //method that puts the countries to visit in alphabetical order
    private static boolean ordedInCountries(LinkedList<String> newList, String newCountry) {
        //creates new linked list - named "anotherStringList"
        ListIterator<String> anotherStringList = newList.listIterator();

        //compares the new country with one that already exists
        while (anotherStringList.hasNext()) {
            int comparison = anotherStringList.next().compareTo(newCountry);

            //checks if comparison is equal to 0 - do not add country
            if (comparison == 0) {
                //prints out the message - country already in the list, moves to the next one
                System.out.println(newCountry + " is already in the list");
                return false;

                //checks if comparison is bigger than 0 - new country appear before this one
            } else if (comparison > 0) {
                //adds new country before the one that is compared to
                anotherStringList.previous();
                anotherStringList.add(newCountry);
                return true;

                //checks if comparison is less than 0
            } else if (comparison < 0) {
            }
        }
        anotherStringList.add(newCountry);
        return true;
    }


    //method that enables user to chose a country from the menu
    private static void chose(LinkedList countries) {

        //initiates new scanner
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        //initiates new ListIterator - "listIterator"
        ListIterator<String> listIterator = countries.listIterator();

        //checks if LinkedList "countries" is empty
        if (countries.isEmpty()) {
            System.out.println("No countries in the list");
            return;

        } else {
            System.out.println("Next to visit is " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            //possible actions with the list
            switch (action) {
                //quits the program
                case 0:
                    System.out.println("No country to visit this year");
                    quit = true;
                    break;

                //goes to the next country
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.hasNext();
                        }
                        forward = false;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Next to visit is " + listIterator.next());
                    } else {
                        System.out.println("This is the end of the list");
                        forward = false;
                    }
                    break;

                //goes to the previous country
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.hasPrevious();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Next to visit is " + listIterator.previous());
                    } else {
                        System.out.println("The start of the list");
                        forward = true;
                    }
                    break;

                //prints out the menu
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    //prints out the menu
    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - Quit programme\n" +
                "1 - Go to next country\n" +
                "2 - Go to previous country\n" +
                "3 - Print menu options");
    }
}
