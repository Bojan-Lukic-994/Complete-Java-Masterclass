public class SharedDigitExercise {

    public static boolean hasSameDigit (int first, int second) {

        //checks if the given numbers are between 10 and 99 (inclusive)
        if ((first < 10) || (first > 99) || (second < 10) || (second > 99) ) {
            return false;
        }

        //initializes first and last digits of both given numbers
        int firA = first / 10;
        int firB = second / 10;
        int secA = first % 10;
        int secB = second % 10;

        //checks if the numbers share at least one digit
        if ((firA == secA) || (firA == secB) || (firB == secA) || (firB == secB)) {
            return true;
        } else {
            return false;
        }
    }
}
