public class PackageKiloExercise {

    public static boolean kiloPack (int bigCount, int smallCount, int goal) {

        public static boolean packProblem (int bigCount, int smallCount, int goal){

            //checks if any of given parameters is smaller than 0
            if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
                return false;
            }

            //initializes tha parameter mod
            int mod = goal % 5;


            //checks if the small count is equal or bigger than goal, or if bigCount times 5 is equal to goal
            if ((smallCount >= goal) || ((bigCount * 5) == goal)) {
                return true;

                //checks if the two given conditions are true, if they both are it returns true
            } else if ((mod <= smallCount) && (((bigCount * 5) + smallCount) >= goal)) {
                return true;
            } else return false;
        }
}
