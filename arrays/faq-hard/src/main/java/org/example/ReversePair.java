package org.example;

/**
 * Given an integer array nums. Return the number of reverse pairs in the array.
 *
 * An index pair (i, j) is called a reverse pair if:
 * 0 <= i < j < nums.length
 * nums[i] > 2 * nums[j]
 *
 * Example 1
 * Input: nums = [6, 4, 1, 2, 7]
 * Output: 3
 *
 * Explanation:
 * The reverse pairs are:
 *
 * (0, 2) : nums[0] = 6, nums[2] = 1, 6 > 2 * 1
 * (0, 3) : nums[0] = 6, nums[3] = 2, 6 > 2 * 2
 * (1, 2) : nums[1] = 4, nums[2] = 1, 4 > 2 * 1
 *
 */
public class ReversePair {

    public int reversePairs(int[] nums) {

        return mergesort(0, nums.length-1, nums);

    }

    public int mergesort(int left, int right, int[] nums){

        int count = 0;
        if(left<right){
            int mid = left+(right-left)/2;
            count += mergesort(left, mid, nums);
            count += mergesort(mid+1, right, nums);
            count += countPairs(left, mid, right, nums);
            merge(left, mid, right, nums);
        }
        return count;
    }

    public int countPairs(int left, int mid, int right, int[] nums){
        int count = 0;
        int j = mid+1;

        for(int i=left; i<=mid; i++){
            while(j<=right && (long)nums[i]> 2L*nums[j]){
                j++;
            }
            count += (j-(mid+1));
        }
        return count;
    }

    public void merge(int left, int mid, int right, int[] nums){
        int k=0;
        int i = left;
        int j = mid+1;
        int[] temp = new int[right-left+1];

        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=right){
            temp[k++] = nums[j++];
        }

        for(i=left,k=0; i<=right; i++,k++){
            nums[i] = temp[k];
        }
    }

}
