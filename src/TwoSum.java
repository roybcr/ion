/**
 * LeetCode #1
 * TwoSum
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 */

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> idxVals = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (idxVals.get(target - nums[i]) != null) 
                return new int[] { i, (idxVals.get(target - nums[i])) };
                
            idxVals.put(nums[i], i);
        }

        return new int[]{};
    }

}
