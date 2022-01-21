/**
 * Given an integer num1 and 2 three-digit integers num2 & num3.
 * Check and return if both num2 and num3 are "inside" num1.
 *
 * For example:
 * For isInIt(1254, 125, 254) -> true.
 * For isInIt(1254, 123, 254) -> false.
 */

public class IsInIt {

    public static boolean isInIt(int num1, int num2, int num3) {
        return isInIt(num1, num2) && isInIt(num1, num3);
    }

    private static boolean isInIt(int num1, int num) {

        if (num1 <= 100) {
            return false;
        }

        int temp = num1 % 1000;
        if (temp == num) 
            return true;
        return isInIt(num1 / 10, num);
    }
}
