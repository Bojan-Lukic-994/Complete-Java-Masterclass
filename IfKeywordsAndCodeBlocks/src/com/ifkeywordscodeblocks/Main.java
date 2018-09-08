package com.ifkeywordscodeblocks;

public class Main {

    public static void main(String[] args) {

        boolean testEnd = true;
        int difficulty = 5;
        int points = 90;
        int time = 40;
        int bonusPoints = 10;

        //example of an if expression
        if (points < 150 && time <= 60) {
            System.out.println("I did not get grade A");
            System.out.println("Test is over");
        } else if (points >= 150 && time <= 60) {
            System.out.println("I got grade A");
            System.out.println("Test is over");
        }


        if (testEnd == true) {
            int finalPoints = points + (difficulty * bonusPoints);
            System.out.println("Final points = " + finalPoints);
        }



        //challenge
        boolean end = true;
        int score2 = 250;
        int levelCompleted2 = 8;
        int bonus2 = 10;

        if (end == true) {
            int finalPoints = score2 + (levelCompleted2 * bonus2);
            System.out.println("Second test points = " + finalPoints);
        }


    }
}
