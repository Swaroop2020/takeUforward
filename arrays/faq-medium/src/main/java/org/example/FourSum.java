package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums and an integer target. Return all quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 *
 * a, b, c, d are all distinct valid indices of nums.
 *
 * nums[a] + nums[b] + nums[c] + nums[d] == target.
 *
 *
 * Notice that the solution set must not contain duplicate quadruplets. One element can be a part of multiple quadruplets. The output and the quadruplets can be returned in any order.
 * Example 1
 * Input: nums = [1, -2, 3, 5, 7, 9], target = 7
 * Output: [[-2, 1, 3, 5]]
 *
 * Explanation:
 * nums[1] + nums[0] + nums[2] + nums[3] = 7
 *
 */
public class FourSum {

    public List<List<Integer>> getFourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i]== nums[i-1]){
                continue;
            }
            int x = nums[i];

            for(int j = i+1; j<n-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int y = nums[j];

                int l = j+1;
                int r = nums.length-1;

                while(l<r){
                    int sum = x+y+nums[l]+nums[r];
                    if(sum == target){
                        result.add(Arrays.asList(x,y, nums[l], nums[r]));

                        while(l<r && nums[l] == nums[l+1]){
                            l++;
                        }

                        while(l<r && nums[r] == nums[r-1]){
                            r--;
                        }
                        l++;
                        r--;
                    }else if(target>sum){
                        while(l<r && nums[l] == nums[l+1]){
                            l++;
                        }
                        l++;
                    }else{
                        while(l<r && nums[r] == nums[r-1]){
                            r--;
                        }
                        r--;
                    }
                }
            }
        }

        return result;
    }
}
