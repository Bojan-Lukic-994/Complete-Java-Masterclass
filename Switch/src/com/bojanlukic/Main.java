package com.bojanlukic;

public class Main {

    public static void main(String[] args) {

 /*       int i = 10;
        if(i == 5) {
            System.out.println("i = 5");
        }else if (i == 7) {
            System.out.println("i = 7");
        } else {
            System.out.println("i is not 5 or 7");
        }   */



        int switchNum = 7;

        //checks if the Num is equal to 1, 2, 3, 4 or 5
        switch(switchNum) {

            //checks if the Num is equal to 1
            case 1:
                System.out.println("Num is equal to 1");
                break;

            //checks if the Num is equal to 2
            case 2:
                System.out.println("Num is equal to 2");
                break;

            //checks if the Num is equal to 3, 4 or 5
            case 3: case 4: case 5:
                System.out.println("Num is equal to 3, 4 or 5");
                break;

                //prints out the message if none of the Nums are found
                default:
                    System.out.println("Num is not equal to 1,2,3,4 or 5");
                    break;
        }

    }
}
