package com.strings;

public class Main {

    public static void main(String[] args) {

        String myString = "There is nothing wrong here";
        System.out.println(myString);
        myString = myString + ", and neither is over there.";
        System.out.println(myString);
        myString = myString + " \u00A9 2018";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("NumberString = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString = " + lastString);

    }
}
