package org.example.easy;

public class CountAllSubsWithSumK {

    public int countSubsequenceWithTargetSum(int[] nums, int k){

        return solve(0, nums, k);
    }

    int solve(int index, int[] nums, int k){

        if(index == nums.length){
            return k==0? 1 : 0;
        }

        int take = solve(index+1, nums, k-nums[index]);

        int skip = solve(index+1, nums, k);

        return take+skip;
    }

}
