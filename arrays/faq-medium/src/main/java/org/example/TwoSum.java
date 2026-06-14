package org.example;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
 *
 * Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in any order.
 *
 * Example 1
 *
 * Input: nums = [1, 6, 2, 10, 3], target = 7
 * Output: [0, 1]
 *
 * Explanation:
 * nums[0] + nums[1] = 1 + 6 = 7
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[][] pairs = new int[nums.length][2];

        for(int i = 0; i< nums.length; i++){
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b)->a[0]-b[0]);

        int l = 0, r = nums.length-1;

        while(l<r){
            int sum = pairs[l][0]+pairs[r][0];
            if(sum>target){
                r--;
            }else if(sum < target){
                l++;
            }else{
                return new int[]{pairs[l][1], pairs[r][1]};
            }
        }

        return new int[0];
    }

}
