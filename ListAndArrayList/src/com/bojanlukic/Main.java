package com.bojanlukic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //initiates scanner and new list of groceries
    private static Scanner scanner = new Scanner(System.in);
    private static Groceries groceries = new Groceries();

    public static void main(String[] args) {
        boolean quitProgram = false;
        int yourChoice = 0;
        instructions();
        while (!quitProgram) {
            System.out.println("Enter your Choice: ");
            yourChoice = scanner.nextInt();
            scanner.nextLine();

            //chose an option
            switch (yourChoice) {
                case 0:
                    instructions();
                    break;
                case 1:
                    groceries.printGroceries();
                    break;
                case 2:
                    addGrocery();
                    break;
                case 3:
                    modifyGrocery();
                    break;
                case 4:
                    removeGrocery();
                    break;
                case 5:
                    searchGrocery();
                    break;
                case 6:
                    newLists();
                case 7: quitProgram = true;
                break;
            }
        }

    }

    //prints the instructions for selected choice
    public static void instructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Print choice options.");
        System.out.println("\t 1 - Print the list of groceries.");
        System.out.println("\t 2 - Add an item to the list.");
        System.out.println("\t 3 - Modify an item.");
        System.out.println("\t 4 - Remove an item.");
        System.out.println("\t 5 - Search for an item.");
        System.out.println("\t 6 - Quit program.");
    }

    //adds new item to groceries
    public static void addGrocery() {
        System.out.println("Enter the grocery: ");
        groceries.addGrocery(scanner.nextLine());
    }

    //modifies an item - removes one item and replaces it with another
    public static void modifyGrocery() {
        System.out.println("Enter grocery name: ");
        String itenNum = scanner.nextLine();
        System.out.println("Enter replacement: ");
        String newItem = scanner.nextLine();
        groceries.modifyGrocery(itenNum, newItem);
    }

    //removes an item from the groceries
    public static void removeGrocery() {
        System.out.println("Enter grocery name: ");
        String itemNum = scanner.nextLine();
        scanner.nextLine();
        groceries.removeGrocery(itemNum);
}

    //searches for an item in the groceries
    public static void searchGrocery() {
        System.out.println("Search an item: ");
        String itemSearch = scanner.nextLine();
        if (groceries.isThere(itemSearch)) {
            System.out.println("Item " + itemSearch + " is found in the list");
        } else {
            System.out.println(itemSearch + " is not in the list");
        }
    }


    public static void newLists() {
        //initiates new list
        ArrayList<String> newList = new ArrayList<String>();

        //gets all the items from Groceries
        newList.addAll(groceries.getGroceryList());

        //another way to initiate and get all items from Groceries - using ArrayList
        ArrayList<String> newList2 = new ArrayList<String>(groceries.getGroceryList());

        //another way to initiate and get all items from Groceries - using Array
        String[] newArray = new String[groceries.getGroceryList().size()];
        newArray = groceries.getGroceryList().toArray(newArray);
    }
}
