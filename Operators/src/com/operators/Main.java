package com.operators;

public class Main {

    public static void main(String[] args) {
        int result = 10 + 5;
        System.out.println("Result is = " + result);

        int previousResult = result;
        result = result - 5;
        System.out.println(previousResult + " - 5 = " + result);

        previousResult = result;
        result = result * 20;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 10;
        System.out.println(previousResult + " / 20 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 30;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 20;
        System.out.println("Result is now " + result);

        boolean isReal = false;
        if (isReal == true)
            System.out.println("It is not real");

        int topScore = 100;
        if (topScore > 100)
            System.out.println("Top score");

        int secondTopScore = 150;
        if ((topScore > secondTopScore) && (topScore < 120))
            System.out.println("Both conditions are true");

        if ((topScore > 50) || (secondTopScore >= 130))
            System.out.println("One of these conditions is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isApple = false;
        if(isApple)
            System.out.println("This should not work");

        isApple = true;
        boolean wasApple = isApple ? true : false;
        if(wasApple)
            System.out.println("was Apple = true");

        //exercise
        double firstValue = 20;
        double secondValue = 88;
        double thirdValue = (firstValue + secondValue) * 25;
        System.out.println("Third value is " + thirdValue);
        double reminderValue = thirdValue % 40;
        System.out.println("Reminder is " + reminderValue);
        if (reminderValue <= 20)
            System.out.println("Total was over the limit");



    }
}
