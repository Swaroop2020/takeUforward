package org.example;

/**
 * Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
 *
 * Example 1
 *
 * Input: nums = [0, 2, 3, 1, 4]
 * Output: 5
 *
 * Explanation:
 * nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
 *
 * Example 2
 * Input: nums = [0, 1, 2, 4, 5, 6]
 *
 * Output: 3
 * Explanation:
 * nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]
 */
public class FindMissingNumber {

    // sum approach
    public int approach1(int[] nums){

        int n = nums.length;
        int expectedSum = n*(n+1)/2;

        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return expectedSum-actualSum;
    }

    // xor approach

    public int approach2(int[] nums){
        int xor = nums.length;

        for(int i=0; i<nums.length;i++){
            xor ^= i^nums[i];
        }
        return xor;
    }

}
