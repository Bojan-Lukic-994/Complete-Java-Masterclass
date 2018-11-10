package com.bojanlukic;

import java.util.ArrayList;

public class Groceries {

    //initiates new array list of strings - groceryList
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //adds item to the grocery list
    public void addGrocery(String item) {
        groceryList.add(item);
    }

    //prints out the groceries
    public void printGroceries() {
        System.out.println("You got " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //modifies an item in the grocery list
    public void modifyGrocery(String curentItem, String newItem) {
        int position = findGrocery(curentItem);
        if (position >= 0) {
            modifyGrocery(position, newItem);
        }
    }

    //modifies an item in the grocery list
    private void modifyGrocery(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }


    //removes an grocery form the grocery list
    public void removeGrocery(String item) {
        int position = findGrocery(item);
        if (position >= 0) {
            removeGrocery(position);
        }
    }

    //removes an item from grocery list
    private void removeGrocery(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    //finds the element in grocery list
    private int findGrocery(String itemSearch) {
        return groceryList.indexOf(itemSearch);
    }

    //checks if an grocery is in grocery list
    public boolean isThere(String itemSearch) {
        int position = findGrocery(itemSearch);
        if (position >= 0) {
            return true;
        } return false;
    }
}

