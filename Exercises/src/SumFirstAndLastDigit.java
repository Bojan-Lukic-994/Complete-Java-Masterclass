public class SumFirstAndLastDigit {

    public static int sumFirstAndLastDigit (int number) {

        //checks if the number is less than 0
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number >= 10) {
            number = number / 10;
        }

        //calculates and returns the sum of first and last digit of the number
        firstDigit = number;
        return sum = firstDigit + lastDigit;
    }
}
