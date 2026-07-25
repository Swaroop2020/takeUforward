package org.example.solutions;

import java.util.HashMap;

/**
 * Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
 *
 * Example 1
 *
 * Input: nums = [10, 5, 2, 7, 1, 9],  k=15
 * Output: 4
 *
 * Explanation:
 * The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.
 *
 */
public class LongestArrayWithSumK {

    public int longestSubArray(int[] nums, int k){

        HashMap<Long, Integer> map = new HashMap<>();
        long prefixSum = 0;
        int maxLength = 0;

        map.put(0L, -1);

        for(int i=0; i<nums.length; i++){
            prefixSum +=nums[i];

            long required = k-prefixSum;
            if(map.containsKey(required)){
                maxLength = Math.max(maxLength, i-map.get(required));
            }

            map.putIfAbsent(prefixSum, i);
        }

        return maxLength;

    }
}
