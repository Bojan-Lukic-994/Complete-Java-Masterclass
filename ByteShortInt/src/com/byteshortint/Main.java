package com.byteshortint;

public class Main {

    public static void main(String[] args) {

       byte myByte = 50;
       short myShort = 10;
       int myInt = 10000;
       long myLong = 50000 + 10 * (myByte + myShort + myInt);

       System.out.println("myLong = " + myLong);

    }
}
