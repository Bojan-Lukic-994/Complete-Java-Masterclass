package com.bojanlukic;

public class Main {

    public static void main(String[] args) {

        Fruit fruit = new Fruit("Pear", 5, 3);

        Apple apple = new Apple(15, 10, "green",  "granny smith");

        //prints out the number of apples
        System.out.println("Number of apples is " + apple.getCount());

        //prints out the color and type of an apple
        System.out.println("Color of the apple is " + apple.getColor() + " and the type is " + apple.getType());

        //prints out the name of the fruit
        System.out.println("Fruit name is " + fruit.getName());

    }
}

