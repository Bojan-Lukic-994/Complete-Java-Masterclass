public class DiagonalStarExercise {

    public static void squareStarPrinter(int num) {

        //checks if the num is equal or bigger than 5
        if (num < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {

                    //checks if any of the following conditions are true - prints out *
                    if ((i == 1) || (j == 1) || (i == j) || (i == num) || (j == num) || (i + j == num + 1)) {
                        System.out.print("*");
                    }

                    //if none of the given conditions are true - prints out " "
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
