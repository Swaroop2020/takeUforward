package org.example.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();

        solve(1, k, n,new ArrayList<Integer>(), result);

        return result;
    }

    void solve(int start, int k, int n, List<Integer> combination, List<List<Integer>> result){

        if(k==0 && n==0){
            result.add(new ArrayList<>(combination));
        }

        if(k==0 || n<0){
            return;
        }

        for(int i=start; i<10; i++){

            combination.add(i);
            solve(i+1, k-1, n-i, combination, result);

            combination.remove(combination.size()-1);
        }

    }
}
