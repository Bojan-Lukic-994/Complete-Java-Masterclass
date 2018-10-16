package com.bojanlukic;

public class Main {

    public static void main(String[] args) {

        //number is written like string and gets print out
        String numLikeStr = "520";
        System.out.println(numLikeStr);

        //parsing value integer (parameter num1) from string
        int num1 = Integer.parseInt(numLikeStr);
        System.out.println(numLikeStr);

        //both parameters gets incriminated by 1
        numLikeStr +=1;
        num1 += 1;

        //prints out the parameters after incrimination
        System.out.println("after incrimination numLikeStr= " + numLikeStr);
        System.out.println("after incrimination num1= " + num1);



    }
}
