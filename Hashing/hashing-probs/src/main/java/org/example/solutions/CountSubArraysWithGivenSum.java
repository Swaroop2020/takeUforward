package org.example.solutions;


import java.util.HashMap;

public class CountSubArraysWithGivenSum {

    public int countSubArrays(int[] nums, int k){

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L,1);

        int count = 0;
        long prefixSum = 0;

        for(int i=0; i<nums.length; i++){

            prefixSum += nums[i];
            long required = prefixSum - k;

            if(map.containsKey(required)){
                count += map.get(required);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }

        return count;
    }
}
