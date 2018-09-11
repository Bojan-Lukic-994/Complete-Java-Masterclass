package com.methods;

public class Main {

    public static void main(String[] args) {

        boolean testEnd;
        int time = 30;
        int finalPoints;
        finalPoints = calculatePoints(true, 40, 4, 30);

        if (finalPoints < 150 && time <= 60) {
            System.out.println("Test is over");
            System.out.println("I did not get grade A");
        } else if (finalPoints >= 150 && time <= 60) {
            System.out.println("Test is over");
            System.out.println("I got grade A");
        }
    }

    public static int calculatePoints(boolean testEnd, int points, int difficulty, int bonusPoints) {

        int testPoints = 0;
        if (testEnd == true) {
            testPoints = points + (difficulty * bonusPoints);
            System.out.println("Final points = " + testPoints);
        }

        return testPoints;
    }
}
