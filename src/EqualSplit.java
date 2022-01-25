/**
 *
 * Equal Split
 *
 * This method takes an array of integers and checks
 * if it can be splitted into two groups of the same size,
 * so that both groups have equal sum.
 * Handles the initial call to a recursive helper method.
 *
 * @param arr The array to check.
 * @return    True if the given array can be Equally Splitted.
 *
 */

public class EqualSplit {

    public static boolean equalSplit(int[] arr) {

        /* If less than two elements, or of odd number of elements,
        can't be splitted into two equal groups. */
        if (arr.length < 2 || arr.length % 2 != 0) 
            return false;
        
        if (arr.length == 2) 
            return arr[0] == arr[1];
        
        /* Pre calculating the total sum of the elements in the array. */
        int sum = sum(arr, 0);

        /* Odd sum cannot be splitted equally. */
        if (sum % 2 != 0) 
            return false;
        
        return equalSplit(arr, 0, arr.length / 2, sum / 2);
    }

    /**
     *
     * This private helper method is an overloading of the public equalSplit(),
     * This method handles the recursive calls and the actual logic.
     *
     * @param arr            The array to check.
     * @param i              The index of the current element.
     * @param availableSlots The amount of members to add to the current group so both groups equal in size.
     * @param sum            The sum for each "Split" to reach.
     *
     * @return               True if the given array can be Equally Splitted.
     *
     */

    private static boolean equalSplit(int[] arr, int i, int availableSlots, int sum) {

        if (availableSlots <= 0) 
            return sum == 0;
        
        /* If there are only n elements left to check and exact n available slots,
        all following members have to join the current group. */

        if (availableSlots == (arr.length - i)) 
            return equalSplit(arr, i + 1, availableSlots - 1, sum - arr[i]);
        
        /* Return one of two scenarios:
        1. The current element is added to the current group, takes an available slot and updates the sum.
        2. The current element shouldn't be in the group and passes on the calls with only incrementing i. */
        if (equalSplit(arr, i + 1, availableSlots - 1, sum - arr[i])) 
            return true;
        return equalSplit(arr, i + 1, availableSlots, sum);
    }

    /**
     * A private Helper method to calculate the sum of an array recursively.
     *
     * @param a The array to calculate the sum of.
     * @param i The current index to add to the sum.
     * @return  The calculated sum of the array.
     */

    private static int sum(int a[], int i) {
        return i == a.length - 1 ? (a[i]) : (a[i] + sum(a, i + 1));
    }

}