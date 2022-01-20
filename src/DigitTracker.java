/**
 * Given two arrays of the same length,
 * This method checks if for any index [i], one array contains a value
 * and the other array contains the correct number of digits that value has.
 */

public class DigitTracker {
    public static boolean digitTracker(int[] a1, int[] a2) {
        return digitTracker(a1, a2, 0);
    }

    public static boolean digitTracker(int[] a1, int[] a3, int i) {
        if (i == a1.length) 
            return true;
        return DigitTracker.countDigits(a1[i]) == a3[i] && digitTracker(a1, a3, ++i);
    }

    private static int countDigits(int i) {
        if (i <= 9) 
            return 1;
        return 1 + countDigits(i / 10);
    }

}
