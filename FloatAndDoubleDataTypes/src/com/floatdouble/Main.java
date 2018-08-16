package com.floatdouble;

public class Main {

    public static void main(String[] args) {
        //width of int = 32(4 bytes)
        int myInt = 5 / 2;
        //width of float = 32(4 bytes)
        float myFloat = 5f / 3;
        //width of double = 64(8 bytes)
        double myDouble = 5d / 3;

        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);


        //exercise
        //1 pound = 0.45359237 kilograms
        int myPounds = 150;
        double myKilos = myPounds * 0.45359237;
        System.out.println("my kilos = " + myKilos);


    }
}
