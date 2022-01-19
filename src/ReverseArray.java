/**
 * Recursively reverse an array.
 */

public class ReverseArray {

    public static int[] reverseArray(int[] a) {
        return reverseArray(a, 0);
    }

    public static int[] reverseArray(int[] a, int i) {
        if (i == a.length / 2) 
            return a;
        
        int temp = a[i];
        a[i] = a[a.length - i - 1];
        a[a.length - i - 1] = temp;

        return reverseArray(a, ++i);
    }
}
