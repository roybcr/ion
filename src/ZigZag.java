/**
 * A ZigZag array is an array whose values are ascending and decending alternately.
 * From an even index to an odd index the values go up,
 * and from an odd index to an even index they go down.
 *
 * This method checks if a given array is a ZigZag array.
 */

public class ZigZag {

    public static boolean zigzag(int[] a) {
        return zigzag(a, 0);
    }

    private static boolean zigzag(int[] a, int i) {
        if (i == a.length - 1) 
            return true;
        
        boolean isZigZag = (i % 2 == 0) ? (a[i] < a[i + 1]) : (a[i] > a[i + 1]);
        return isZigZag && zigzag(a, i + 1);
    }
}
