/**
 * Given an array and a target sum,
 * check if there are elements in the array whose sum is equal to the target.
 */

public class SumNum {

    public static boolean sumNum(int[] a, int targetSum) {
        return sumNum(a, targetSum, 0);
    }

    public static boolean sumNum(int[] a, int targetSum, int idx) {
        if (idx == a.length) 
            return false;
        if (a[idx] == targetSum) 
            return true;
        
        return sumNum(a, targetSum - a[idx], idx + 1) || sumNum(a, targetSum, idx + 1);
    }
}
