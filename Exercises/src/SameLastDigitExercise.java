public class SameLastDigitExercise {

    public static boolean hasSameLastDigit (int a, int b, int c) {

        //checks if given numbers are between 10 and 99 (inclusive)
        if ((a < 10) || (a > 999)
            || (b < 10) || (b > 999)
            || (c < 10) || (c > 999)) {
            return false;
        }

        //initializes the last digits of all given numbers
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        //checks if at least two of the given numbers share last digit
        if ((aLast == bLast)
            || (aLast == cLast)
            || (bLast == cLast)) {
            return true;
        } else {
            return false;
        }
    }
}
