public class MinToYearDay {

    public static void printYearsAndDays(long minutes){

        //checks if the nuber of minutes is bigger than 0
        if  (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes >= 0) {

            //calculates the number of days and years
            long days = (minutes / 60) / 24;
            long year = (minutes / 60) / 24 / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + year + " y" + " and " + remainingDays + " d");
        }
    }
}
