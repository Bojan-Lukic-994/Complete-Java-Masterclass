public class LargestPrimeExercise {

    public static int getBiggestPrime(int num) {

        //checks if the num is equal or bigger than 2
        if (num < 2) {
            return -1;
        }

        //initializes parameter biggestPrime
        int biggestPrime = num;

        //checks if the num is bigger than 0
        if (num >= 0) {

            //calculates the largest prime factor of the given num
            for (int i = 2; i < num; i++) {
                if (biggestPrime % i == 0) {
                    do {
                        biggestPrime = biggestPrime / i;
                    } while (biggestPrime % i == 0);
                }
                if (biggestPrime == 1) {
                    return i;
                }

            }
        } else {
            return -1;
        }

        //returns the given num
        return num;

    }
}
