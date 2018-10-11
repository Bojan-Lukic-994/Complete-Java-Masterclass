public class NumberToWordsExercise {

    public static void numberToWords (int number) {

        String numberToWord = "";

        //checks if the number is bigger than 0
        if (number < 0) {
            System.out.println("Invalid Value");

            //initiates the parameter reverse order and gives it a value
            int reversed = reverse(number);
            int lastDigit = 0;

            for (int i = 0; i < getDigitCount(number); i++) {
                lastDigit = reversed % 10;

                switch (lastDigit) {
                    case 0: numberToWord = "Zero";
                        break;
                    case 1: numberToWord = "One";
                        break;
                    case 2: numberToWord = "Two";
                        break;
                    case 3: numberToWord = "Three";
                        break;
                    case 4: numberToWord = "Four";
                        break;
                    case 5: numberToWord = "Five";
                        break;
                    case 6: numberToWord = "Six";
                        break;
                    case 7: numberToWord = "Seven";
                        break;
                    case 8: numberToWord = "Eight";
                        break;
                    case 9: numberToWord = "Nine";
                        break;
                }

                System.out.println(numberToWord);
                reversed = reversed / 10;
            }
            System.out.println(numberToWord);

        }


    }


    public static int reverse (int number) {

        //initiates parameters for reverse number, last digit and new order of numbers
        int reverseNum = 0;
        int newOrder = getDigitCount(number);
        int lastDigit = 0;

        //while number is not equal to 0, it calculates the last digit, reverse order and returns it
        while (number != 0) {
            lastDigit = number % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            number = number /10;
        }
        return reverseNum;
    }



    public static int getDigitCount (int number) {

        int count = 0;

        //checks if the given number is bigger than 0
        if (number < 0) {
            return -1;
        }

        //while given number is bigger than 0, it returns the number of last digits in given number
        do {
            number = number / 10;
            count++;
        } while (number > 0);

        return count;
    }
}
