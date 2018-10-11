public class PerfectNumExercise {

    public static boolean isPerfect (int num) {

        //checks if the given num is bigger than 1
        if (num < 1) {
            return false;
        }

        int sum = 0;
        int remainder = 0;

        //checks if the remainder of the num is 0, than sums up the proper divisors
        for (int i = 1; i <= (num / 2); i++) {
            remainder = num % i;
            if (remainder == 0) {
                sum = sum + i;
            }
        }

        //if the num is equal to the sum of the proper divisors, it is the perfect num
        if (sum == num) {
            System.out.println("It is the perfect num");
            return true;
        }

        return false;
    }


}
