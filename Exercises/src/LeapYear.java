public class LeapYear {

    //checks if selected year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year >= 1 && year <= 9999) && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
