public class DecComparator {

    //checks if the two numbers are equal up to three decimal places
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if (java.lang.Math.abs(num1 - num2) <= 0.0009) {
            return true;
        }
        return false;
    }
}




                       //ANOTHER SOLUTION

/*public static boolean areEqualByThreeDecimalPlaces (double num1 , double num2){

    int num1Int = (int) (num1 * 1000);
    int num2Int = (int) (num2 * 1000);

    if (num1Int == num2Int) return true;

    return false;*/
