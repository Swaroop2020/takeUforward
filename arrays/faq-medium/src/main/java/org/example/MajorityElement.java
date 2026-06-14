package org.example;

/**
 *
 *Given an integer array nums of size n, return the majority element of the array.
 *
 *
 *
 * The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.
 *
 * Example 1
 * Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
 * Output: 7
 *
 * Explanation:
 * The number 7 appears 5 times in the 9 sized array
 */

// ****** This is Boyer moores voting Algorithm *******
public class MajorityElement {

    public int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int num : nums){
            if(count==0){
                candidate = num;
                count++;
            }else if(num == candidate){
                count++;
            }else{
                count--;
            }
        }

        return candidate;

    }
}
