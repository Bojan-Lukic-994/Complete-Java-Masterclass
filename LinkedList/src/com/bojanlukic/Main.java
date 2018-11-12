package com.bojanlukic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //initiates two running backs
        RuningBack rb1 = new RuningBack("Gurley", 92.05);
        RuningBack rb2 = new RuningBack("Elliot", 95.50);

        //prints out runing backs speed and names
        System.out.println(rb1.getName() + " " +rb1.getSpeed());
        System.out.println(rb2.getName() + " " +rb2.getSpeed());

        //how memory is used and allocated - rb2 speed is set for rb1
        rb2 = rb1;
        rb2.setSpeed(50.00);
        System.out.println("Speed for " + rb1.getName() + " after change is " + rb2.getSpeed());



        //initiates new array list
        ArrayList<Integer> newList = new ArrayList<Integer>();

        //adds items to the array list
        newList.add(5);
        newList.add(9);
        newList.add(10);

        //prints out the items from array list
        for (int i = 0; i< newList.size(); i++) {
            System.out.println(i + ": " + newList.get(i));
        }
    }
}
