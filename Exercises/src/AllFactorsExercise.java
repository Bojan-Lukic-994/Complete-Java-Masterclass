public class AllFactorsExercise {

    public static int printFactors(int number) {

        //checks if the number is bigger than one
        if (number < 1) {
            System.out.println("Invalid number");
        }


        //checks if given number divided by parameter i is even and prints it out, while the given condition is true
        while (int i = 0; i <= number; i++){
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
