package org.example.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets1 {

    public List<Integer> subsetSums(int[] nums) {
        List<Integer> result = new ArrayList<>();

        solve(0, nums, 0, result);

        return result;
    }

    public void solve(int index, int[] nums, int sum, List<Integer> result){

        if(index == nums.length){
            result.add(sum);
            return;
        }

        solve(index+1, nums, sum+nums[index], result);

        solve(index+1, nums, sum, result);
    }

}
