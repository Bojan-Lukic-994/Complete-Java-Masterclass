public class TeenNumCheck {

    public static boolean hasTeen(int num1, int num2, int num3) {

        //checks if any of given numbers is "teen"
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        }
        return false;
    }
}