public class PlayPet {

    public static boolean petPyaingIfSummer(boolean summer, int temperature) {

        //checks if it is summer and if the temperature is between given numbers
        if ((summer == true) && (temperature <= 45) && (temperature >=25)) {
            System.out.println("Pet is playing");
           return true;

           //checks if it is not summer and if the temperature is between given numbers
        } else if ((summer == false) && (temperature <= 35) && (temperature >=25)) {
            System.out.println("Pet is playing");
            return true;

            //prints that pet is not playing
        } else {
            System.out.println("Pet is not plaing");
            return false;
        }
    }
}
