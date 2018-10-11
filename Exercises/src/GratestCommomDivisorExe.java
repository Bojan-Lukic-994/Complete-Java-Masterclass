public class GratestCommomDivisorExe {

    public static int getGreatestDiv(int first, int second) {

        //checks if both numbers are bigger than 10
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        //initiates parameters for biggest common divisor and smallest number
        int biggestDiv = 0;
        int minNum = 0;

        //checks which number is bigger, first or second
        if (first < second) {
            minNum = first;
        } else {
            minNum = second;
        }

        //calculates the biggest common divisor for given numbers
        for (int i = 1; i <= minNum; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                biggestDiv = i;
            }
        }

        //returns the biggest common divisor for given numbers
        return biggestDiv;
    }
}
