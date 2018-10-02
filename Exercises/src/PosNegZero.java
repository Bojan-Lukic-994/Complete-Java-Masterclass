public class PosNegZero {

    public static void main(String[] args) {
        givenNumber(25);
        givenNumber(0);
        givenNumber(-40);
    }

    public static void givenNumber(int number) {
        if (number > 0) {
            System.out.println("number is positive");
        } else if (number < 0) {
            System.out.println("number is negative");
        } else if (number == 0) {
            System.out.println("number is equal to 0");
        }
    }
}