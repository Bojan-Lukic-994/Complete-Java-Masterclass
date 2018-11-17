package com.bojanlukic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Challenge description

    // Create a simple interface that allows an object to be saved to some sort of storage medium.
    // The exact type of medium is not known to the interface (nor to the classes that implement it).
    // The interface will just specify 2 methods, one to return an ArrayList of values to be saved
    // and the other to populate the object's fields from an ArrayList.
    //
    // Create some sample classes that implement your saveable interface (we've used the idea of a game,
    // with Players and Monsters, but you can create any type of classes that you want).
    //
    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
    //
    // In Main, write a method that takes an object that implements the interface as a parameter and
    // "saves" the values.
    // We haven't covered I/O yet, so your method should just print the values to the screen.
    // Also in Main, write a method that restores the values to a saveable object.
    // Again, we are not going to use Java file I/O; instead use the readValues() method below to
    // simulate getting values from a file – this allows you to type as many values as your class
    // requires, and returns an ArrayList.


    public static void main(String[] args) {

        //initiates new RunningBack with parameters
        RunningBack hunt = new RunningBack("Kareem Hunt", 85, 88, "KC Chiefs");

        //prints out RunningBack hunt
        System.out.println(hunt.toString());
        saveItem(hunt);

        System.out.println("------------------------------------");

        //sets the strength and speed of RunningBack hunt
        hunt.setStrength(100);
        hunt.setSpeed(85);

        //prints out RunningBack hunt
        System.out.println(hunt);
        saveItem(hunt);

        System.out.println("------------------------------------");

        //initiates new Team - team (with parameters name - Atlanta, players - 53)
        Team team = new Team("Atlanta", 53);

        //prints out team
        System.out.println(team);
        saveItem(team);

        System.out.println("------------------------------------");

        //initiates new Team - team2 (with parameters name - Tampa Bay, players - 48)
        Team team2 = new Team("Tampa Bay", 48);

        //prints out team2
        System.out.println(team2);
        saveItem(team2);
    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    //method that saves items to the device
    public static void saveItem(INFLStorage itemToSave) {

        //saves added item to the device
        for (int i = 0; i < itemToSave.write().size(); i++) {
            System.out.println("Now saving " + itemToSave.write().get(i) + " to device");
        }
    }

    //method that loads items from the device
    public static void loadItem(INFLStorage itemToLoad) {

        //loads given items from the device
        ArrayList<String> values = readValues();
        itemToLoad.store(values);
    }
}