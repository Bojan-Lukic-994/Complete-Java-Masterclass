public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        //initializes lastDigit and sumDigit
        int lastDigit = 0;
        int sumDigit = 0;

        //checks if the number is bigger than 0
        if (number < 0) {
            return -1;
        } else {

            //while number is bigger than 0, it sums up even digits
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumDigit = sumDigit + lastDigit;
                }
                number = number / 10;
            }

        }

        //returns the sum of all the even digits
        return sumDigit;
    }
}
