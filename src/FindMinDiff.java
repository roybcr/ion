/**
     *
     * Find Min Diff
     *
     * This algorithm finds the minimal distance between x, y in the given array.
     * if neither x nor y exists in the array, the algorithm returns Integer.MAX_VALUE;
     *
     * Time Complexity:
     * In the worst case, the algorithm will have to iterate through the given array - from start to end.
     * The complexity is growing in a direct proportion to the size of the input given,
     * and thus, the time complexity of the algorithm is linear: O(n).
     *
     * Space Complexity:
     * A constant number of variables is declared and used,
     * regardless of the input size.
     *
     * The space complexity of the algorithm is constant: O(1).
     *
     * @param a An integer array to find the minimum distance between x and y in.
     * @param x The first number to search for in the array.
     * @param y The second number to search for in the array.
     *
     * @return  The minimal difference between x and y.
     *          If one number is missing or both,
     *          returns the maximal value for an Integer.
     *
     */

public class FindMinDiff {

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
                    if (minDiff == 1)
                        return 1;
                }

                /* Update temp to hold the new position of the last seen x or y. */
                temp = i;
            }
        }

        return minDiff;
    }
}