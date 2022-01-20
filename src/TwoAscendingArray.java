/**
 * In the given array, check if all values at even indices and all values at odd indices 
 * are ordered in an ascending order.
 */

public class TwoAscendingArray {
    
    public static boolean twoAscending(int[] a) {
        return twoAscending(a, 0) && twoAscending(a, 1);
    }
    
    public static boolean twoAscending(int[] a, int i) {
        if(i >= a.length - 2)
            return true;
    
        return a[i] < a[i + 2] && twoAscending(a, i + 2);
    }
}
