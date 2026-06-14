package org.example;

/**
 * Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:
 *
 * Every consecutive pair of integers have opposite signs.
 *
 * For all integers with the same sign, the order in which they were present in nums is preserved.
 *
 * The rearranged array begins with a positive integer.
 *
 * Example 1
 * Input : nums = [2, 4, 5, -1, -3, -4]
 * Output : [2, -1, 4, -3, 5, -4]
 *
 * Explanation:
 *
 * The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions
 */
public class RearrangeBySign {

    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0;
        int negIndesx = 1;

        int[] result = new int[nums.length];

        for(int num : nums){
            if(num>0){
                result[posIndex] = num;
                posIndex += 2;
            }else{
                result[negIndesx] = num;
                negIndesx += 2;
            }
        }

        return result;
    }

}
