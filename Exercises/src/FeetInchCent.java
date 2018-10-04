public class FeetInchCent {

    public static void main(String[] args) {

      double cent = calcFeetInchCent(10, 3);
      if(cent < 0.0) {
          System.out.println("Invalid parameters");
      }

      calcFeetInchCent(20);

    }

    //turns feet and inches into centimeters
    public static double calcFeetInchCent(double feet, double inches) {

        //checks if feet is bigger than 0 and if inches is between 0 and 12
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid parameters");
            return -1;
        }

        //calculates number of cm in given feet and inches
            double cent = (feet * 12) * 2.54;
            cent += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + cent + "cm");
        return cent;
    }


    public static double calcFeetInchCent(double inches) {

        //checks if inches is bigger than 0
        if(inches < 0) {
            System.out.println("Invalid parameter (inches)");
            return -1;
        }

        //calcualates the number of feet and remaining iches in given inches
        double feet = (int) inches / 12;
        double restInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet " + restInches + " inches");
        return calcFeetInchCent(feet, restInches);
    }
}
