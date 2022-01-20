/**
 * KArray is a recursive method to check
 * if a given array is K-Array.
 *
 * K-Array is an array in which the absolute diff between any
 * two adjacent elements is exactly K.
 *
 * For example:
 * [0, 2, 4, 2, 0] -> true.
 * [0, 2, 4, 8, 10] -> false.
 */

public class KArray {

    public static boolean kArray(int[] a) {
        if (a.length <= 2) 
            return true;
        
        return kArray(a, 1, Math.abs(a[0] - a[1]));
    }

    public static boolean kArray(int[] a, int i, int diff) {
        if (i == a.length - 1) 
            return true;
        
        return Math.abs(a[i] - a[i + 1]) == diff && kArray(a, i + 1, diff);
    }
}
