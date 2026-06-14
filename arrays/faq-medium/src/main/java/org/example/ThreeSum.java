package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums. Return all triplets such that:
 *
 * i != j, i != k, and j != k
 * nums[i] + nums[j] + nums[k] == 0.
 *
 *
 * Notice that the solution set must not contain duplicate triplets. One element can be a part of multiple triplets. The output and the triplets can be returned in any order.
 *
 * Example 1
 * Input: nums = [2, -2, 0, 3, -3, 5]
 * Output: [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]
 *
 * Explanation:
 * nums[1] + nums[2] + nums[0] = 0
 * nums[4] + nums[1] + nums[5] = 0
 * nums[4] + nums[2] + nums[3] = 0
 */
public class ThreeSum {

    public List<List<Integer>> findThreeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length-2; i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length-1;

            while(l<r){

                if(nums[l]+nums[i]+nums[r]==0){
                    result.add(List.of(nums[i], nums[l], nums[r]));

                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }

                    while(l<r && nums[r]== nums[r-1]){
                        r--;
                    }

                    l++;
                    r--;
                } else if(nums[l]+nums[i]+nums[r] >0){
                    while(l<r && nums[r]== nums[r-1]){
                        r--;
                    }
                    r--;
                }else{
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    l++;
                }

            }
        }
        return result;
    }

}
