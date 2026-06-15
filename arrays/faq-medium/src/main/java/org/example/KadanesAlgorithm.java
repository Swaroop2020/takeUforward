package org.example;

/**
 * Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 * Example 1
 * Input: nums = [2, 3, 5, -2, 7, -4]
 * Output: 15
 *
 * Explanation:
 * The subarray from index 0 to index 4 has the largest sum = 15
 */
public class KadanesAlgorithm {

    public int maxSubArray(int[] nums) {

        int currSum = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            currSum = Math.max(currSum+nums[i], nums[i]);
            max = Math.max(currSum, max);
        }

        return max;
    }

}
