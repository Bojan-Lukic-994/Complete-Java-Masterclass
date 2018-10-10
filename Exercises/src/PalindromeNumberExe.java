public class PalindromeNumberExe {

    public static boolean isPalindrome(int num) {

        int lastDigit;
        int revNum = 0;
        int tempNum = num;

        while (num != 0) {
            lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        if (tempNum == revNum) {
            return true;
        } else {
            return false;
        }
    }
}
