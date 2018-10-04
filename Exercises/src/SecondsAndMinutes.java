public class SecondsAndMinutes {

    //prints this message if invalid value is given
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        //both methods print the number of hours, minutes and seconds
        System.out.println(getDurationString(67, 5));
        System.out.println(getDurationString(150L));
    }


    public static String getDurationString(long min, long sec) {

        //checks if the min parameter is bigger than 0 and if sec parameter is between 0 and 59
        if ((min < 0) || (sec < 0) || (sec > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        //calculates the number of hours
        long hours = min / 60;
        long remainingMin = min % 60;

        //prints hours in 00 shape
        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        //prints minutes in 00 shape
        String minString = remainingMin + "m";
        if(min < 10) {
            minString = "0" + minString;
        }

        //prints seconds in 00 shape
        String secString = sec + "s";
        if(sec < 10) {
            secString = "0" + secString;
        }

        //returns number of hours, minutes and seconds in 00h00m00s shape
        return hoursString + " " + minString + " " + secString;
    }


    private static String getDurationString(long sec) {

        //checks if the sec parameter is bigger than 0
        if (sec < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        //calculates the number of minutes and remaining seconds
        long min = sec / 60;
        long remainingSec = sec % 60;
        return getDurationString(min, remainingSec);
    }
}
