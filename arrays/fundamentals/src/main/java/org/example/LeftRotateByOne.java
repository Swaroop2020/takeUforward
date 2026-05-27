package org.example;

/**
 * Time Complexity : O(n)
 */
public class LeftRotateByOne {

    public void rotateArrayByOne(int[] nums) {
        int first = nums[0];

        for(int i=1;i<nums.length;i++){
            nums[i-1]= nums[i];
        }
        nums[nums.length-1] = first;

    }

}
