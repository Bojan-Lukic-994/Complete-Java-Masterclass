public class OverloadingExe {

    public static void main(String[] args) {
        int newPoints = getPoints("skabo", 50);
        System.out.println("New points = " + newPoints);
        getPoints(60);
        getPoints("DD", 200);
    }

    //method that gets player name and points
    public static int getPoints(String name, int points) {
        System.out.println("Player " + name + " = " + points + " points ");
        return points * 10;
    }

    //method that gets only player points
    public static int getPoints(int points) {
        System.out.println("Player " + "points " + points);
        return points * 10;
    }
}
