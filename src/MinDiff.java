/**
 * This method finds the minimal distance between x, y in the given array.
 * if neither x nor y exists in the array, the method returns Integer.MAX_VALUE;
 *
 * Time Complexity: O(n) -
 * in the worst case, which is one where one number is missing, the method will run n times.
 *
 * Space Complexity: O(1) -
 * A constant number of variables is used.
 *
 */

public class MinDiff {

    public static int findMinDiff(int[] a, int x, int y) {

        int minDiff = Integer.MAX_VALUE;

        /* If a[] contains one or zero values, or,
           If a[] contains 2 values and one of the values is neither x nor y, then exit early. */

        if (a.length <= 2) {
            if ((a.length <= 1) || (a[0] != x && a[1] != x) || (a[0] != y && a[1] != y)) 
                return minDiff;
            return 1;
        }

        /* temp holds the last position where x or y were seen. */
        int temp = -1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == x || a[i] == y) {

                /* If temp has already been updated (we already saw at least one x or y),
                and the value in a[temp] is different from the current value at a[i]. */

                if (temp > -1 && a[temp] != a[i]) {

                    /* Update minDiff only if the new distance is smaller. */
                    minDiff = Math.min(minDiff, (i - temp));

                    if (minDiff == 1) {
                        return 1;
                    }
                }

                /* Update temp to hold the last position where we saw x or y. */
                temp = i;
            }
        }

        return minDiff;
    }
}
