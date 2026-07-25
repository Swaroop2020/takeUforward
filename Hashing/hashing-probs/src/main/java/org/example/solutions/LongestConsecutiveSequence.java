package org.example.solutions;


import java.util.HashSet;

/**
 * Given an array nums of n integers.
 *
 * Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.
 *
 *
 * Example 1
 * Input: nums = [100, 4, 200, 1, 3, 2]
 * Output: 4
 *
 * Explanation:
 * The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4. This sequence can be formed regardless of the initial order of the elements in the array.
 *
 */
public class LongestConsecutiveSequence {

    public int calculate(int[] nums){

        if(nums==null || nums.length ==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        for(int i : nums){
            set.add(i);
        }

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int startingPoint = nums[i];
                int currentLength = 1;
                while(set.contains(startingPoint+1)){
                    currentLength++;
                    startingPoint++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;

    }
}
