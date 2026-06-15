package org.example;

/**
 * Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
 * The sorting must be done in-place, without making a copy of the original array.
 *
 * Example 1
 * Input: nums = [1, 0, 2, 1, 0]
 * Output: [0, 0, 1, 1, 2]
 *
 * Explanation:
 * The nums array in sorted order has 2 zeroes, 2 ones and 1 two
 */
public class Sort0s1sAnd2s {

    public void sortZeroOneTwo(int[] nums) {
        int mid= 0, low= 0, high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(low, mid, nums);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else {
                swap(mid, high, nums);
                high--;
            }
        }
    }

    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
