public class ThreeAndFiveSumExe {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        //checks if the numbers are dividable by 2 and 5 then sums them up
        for (int i = 1; i <= 500; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Number is = " + i);
            }

            //when 5 numbers dividable by 3 and 5 are found, the for loop closes
            if (count == 5) {
                break;
            }
        }

        //prints out the final sum of found numbers
        System.out.println("Sum = " + sum);
    }
}