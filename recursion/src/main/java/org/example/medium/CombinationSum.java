package org.example.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target){

        List<List<Integer>> result = new ArrayList<>();

        solve(0, candidates, target,new ArrayList<Integer>(), result);
        return result;
    }

    void solve(int index, int[] nums, int k,List<Integer> current, List<List<Integer>> result){

        if(k==0){
            result.add(new ArrayList<>(current));
            return;
        }
        
        if(k<0 || index==nums.length){
            return;
        }
        
        current.add(nums[index]);
        solve(index, nums, k-nums[index], current, result);
        current.remove(current.size()-1);
        
        solve(index+1, nums, k, current, result);
    }
}
