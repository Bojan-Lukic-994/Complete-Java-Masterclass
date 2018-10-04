public class EqualPrint {

    public static void equalChecker(int x, int y, int z) {

        //checks if all the numbers are bigger than 0
        if ((x < 0) || (y < 0) || (z < 0)) {
            System.out.println("Invalid Value");

            //checks if all the numbers are equal and prints them
        } else if ((x == y) && (x == z) && (y == z) ) {
            System.out.println("All numbers are equal");

            //checks if all the numbers are different and prints them
        } else if ((x != y) && (x != z) && (y != z)) {
            System.out.println("All numbers are different");

            //pritns all the numbers
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
