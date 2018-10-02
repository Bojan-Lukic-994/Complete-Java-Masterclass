public class dogBark {

    public static boolean bark(boolean barking, int time) {


        if (time < 0 || time > 23) {
            return false;
        }
        //Checks the hourOfDay Condition and Barking
        else if ((time < 8 || time > 22) && barking) {
            return true;

        } else {
            return false;
        }

    }
}