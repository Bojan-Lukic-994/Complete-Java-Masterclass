public class DaysInMonthLeapYear {

    public static boolean isLeapYear(int year) {

        //checks if a year is between 1 and 9999
        if ((year >= 1) && (year <= 9999)) {

            //checks if it is a leap year
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    public static int getDaysInMonth(int month, int year) {

        //checks if months are between 1 and 12 and if year is between by 1 and 9999
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999) {
            return -1;
        }

        switch (month) {

            //cases when months have 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;


            //checks if it is a leap year - if it is, case has 29 days, otherwise it has 28 days
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

                //cases when months have 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            //if month is invalid, returns -1
            default:
                return -1;
        }
    }
}
