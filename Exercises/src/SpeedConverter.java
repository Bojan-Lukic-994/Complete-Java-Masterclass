public class SpeedConverter {

    //instantiate new parameter named mph
    static double mph;

    //method that converts kilometers to miles per hour
    public static long toMilesPerHour(double kph) {

        //checks if kph is bigger or equal to 0
        if (kph >= 0) {

            //converts kph to mph, rounds it and returns it
            mph = kph / 1.609;
            mph = Math.round(mph);
            return (long) mph;

            //if kph is less than 0, returns -1
        } else {
            mph = -1;
            return (long) mph;
        }
    }

    //method that prints the conversion of kilometers to miles per hour
    public static void printConversion(double kilometersPerHour) {

        //checks if kilometersPerHOur is bigger than 0
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }

        //prints the conversion
        else {
            System.out.println(kilometersPerHour + " km/h = "
                    + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
