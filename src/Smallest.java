/**
 * Recursively find & return the index of the smallest value in the array.
 */

public class Smallest {

    public static int smallest(int[] a) {
        if (a.length <= 1) 
            return 0;
        if (a.length == 2) 
            return a[0] <= a[1] ? 0 : 1;
        
        return smallest(a, 0);
    }

    private static int smallest(int[] a, int i) {
        if (i == a.length - 1) 
            return i;
        
        int val = smallest(a, i + 1);

        if (a[i] < a[val]) 
            return i;
        return val;
    }
}
