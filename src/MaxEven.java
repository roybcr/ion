/**
 * Given an array of integers,
 * This method returns the maximum between all the values at even index.
 */

public class MaxEven {

    public static int maxEven(int[] a) {
        if (a.length <= 2) 
            return a[0];
        return maxEven(a, 0);
    }

    public static int maxEven(int[] a, int i) {
        if (i >= a.length) 
            return Integer.MIN_VALUE;
        
        int result = maxEven(a, i + 2);
        return Math.max(a[i], result);
    }
}
