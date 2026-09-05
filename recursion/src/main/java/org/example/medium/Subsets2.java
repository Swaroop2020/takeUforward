package org.example.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        solve(0, nums, new ArrayList<Integer>(), result);

        return result;

    }

    void solve(int start, int[] nums, List<Integer> currentSet, List<List<Integer>> result){

        result.add(new ArrayList<>(currentSet));

        for(int i= start; i< nums.length; i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }

            currentSet.add(nums[i]);
            solve(i+1, nums, currentSet, result);

            currentSet.remove(currentSet.size()-1);
        }

    }
}
