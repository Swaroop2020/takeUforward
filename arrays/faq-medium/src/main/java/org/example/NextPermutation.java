package org.example;

/**
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 *
 * For example, for arr = [1,2,3], the following are all the permutations of arr:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].
 *
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integers.
 * More formally, if all the permutations of the array are sorted in lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted order.
 *
 * If such arrangement is not possible (i.e., the array is the last permutation), then rearrange it to the lowest possible order (i.e., sorted in ascending order).
 *
 * You must rearrange the numbers in-place and use only constant extra memory.
 *
 * Example 1
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 *
 * Explanation:
 * The next permutation of [1,2,3] is [1,3,2].
 */
public class NextPermutation {

    public void findNextPermutation(int[] nums) {

        int n= nums.length;
        int i = nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){

            int j = nums.length-1;

            while(nums[j]<=nums[i]){
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }


        reverse(++i, nums.length-1, nums);
    }

    void reverse(int i, int j, int[] nums){

        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
