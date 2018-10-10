public class SumDigitExercise {

    public static void main(String[] args) {

        //prints out the sum of digits of given number
        System.out.println("Sum of all digits is "  + digitsSum(1537) );

    }

    public static int digitsSum (int num) {

        //checks if given number is bigger than 10
        if (num < 10) {
            return -1;
        }

        int sum = 0;

        while (num > 0) {

            //extract the least significant digit
            int digit = num % 10;
            sum+= digit;

            //number = number / 10
            num /= 10;
        }

        //returns the sum of all digits in given number
        return sum;
    }

}
