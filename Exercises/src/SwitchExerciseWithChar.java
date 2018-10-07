public class SwitchExerciseWithChar {

    public static void main(String[] args) {

        char character = 'D';

        switch (character) {

            //checks if the character is eqaul to "A"
            case 'A':
                System.out.println("Character is A");
                break;

            //checks if the character is eqaul to "B"
            case 'B':
                System.out.println("Character is B");
                break;

            //checks if the character is eqaul to "C"
            case 'C':
                System.out.println("Character is C");
                break;

            //checks if the character is eqaul to "D"
            case 'D':
                System.out.println("Character is D");
                break;

            //checks if the character is eqaul to "E"
            case 'E':
                System.out.println("Character is E");
                break;

            //displays the message if none of the characters are found
            default:
                System.out.println("Character is not found");
                break;
        }
    }
}
