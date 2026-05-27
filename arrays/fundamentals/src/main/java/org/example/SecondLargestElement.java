package org.example;

/**
 * Time Complexity : O(n)
 */
public class SecondLargestElement {

    public int findSecondLargest(int[] nums) {

        if(nums == null || nums.length < 2) {
            return -1;
        }

        int largest = nums[0];
        int second = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                second = largest;
                largest = nums[i];
            }else if(largest>nums[i] && nums[i]>second){
                second = nums[i];
            }
        }
        return second == Integer.MIN_VALUE? -1: second;
    }

}
