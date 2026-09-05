package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceWithSumK {

    public boolean checkSubSequence(int[] nums, int k){

        return solve(0, nums, k);
    }

    boolean solve(int index, int[] nums, int k){
        if(nums.length == index){
            return k==0;
        }

        if(solve(index+1, nums, k-nums[index])){
            return true;
        }

        if(solve(index+1, nums, k)){
            return true;
        }

        return false;
    }
}
