public class OddNumberExercise {

    public static boolean oddNumber(int num) {

        //checks if the number is odd
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is and dd number");
                return true;
            } else {
                System.out.println(num + " is not an odd number");
                return false;
            }
        }

        System.out.println("Invalid number");
        return false;

    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        //checks if start parameter us bigger than 0 and if end parameter is bigger or equal to start
        if ((start > 0) && (end >= start)) {

            //checks if number is odd and sums it up
            for (int i = start; i <= end; i++) {

                if (oddNumber(i)) {
                    sum += i;
                }
            }

            //prints out the sum of all the odd numbers
            System.out.println(sum);
            return sum;
        }

        return -1;
    }
}
