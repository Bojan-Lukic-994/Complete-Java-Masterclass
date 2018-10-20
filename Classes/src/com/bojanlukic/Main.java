package com.bojanlukic;

public class Main {

    public static void main(String[] args) {

        //creates new objects of Fruit class
        Fruit apple = new Fruit();
        Fruit pear = new Fruit();
        Fruit watermelon = new Fruit();

        //prints out the color of the apple - example 1 (using constructor from class Fruit)
        apple.color = "Green";
        System.out.println("Apple color is " + apple.color);


        //prints out the color of the apple - example 2 (using getters and setters from class Fruit)
        apple.setColor("Blue");
        System.out.println("Apple color is " + apple.getColor());

        //prints out the shape of the pear
        pear.setShape("Cube");
        System.out.println("Pear shape is " + pear.getShape());
    }
}
