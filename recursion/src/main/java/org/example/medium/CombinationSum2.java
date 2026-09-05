package org.example.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target){

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        solve(0, candidates, target, new ArrayList<Integer>(), result);

        return  result;
    }

    void solve(int start, int[] candidates, int target, List<Integer> current, List<List<Integer>> result){

        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(start == candidates.length || target<0){
            return;
        }

        for(int end=start; end<candidates.length; end++){

            if(end > start && candidates[end]==candidates[end-1]){
                continue;
            }

            current.add(candidates[end]);
            solve(end+1, candidates, target-candidates[end], current, result);
            current.remove(current.size()-1);
        }

    }
}
