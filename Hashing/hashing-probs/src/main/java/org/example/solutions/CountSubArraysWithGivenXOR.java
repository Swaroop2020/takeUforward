package org.example.solutions;

import java.util.HashMap;

public class CountSubArraysWithGivenXOR {

    public int subarraysWithXorK(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        int prefixXor = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            prefixXor ^= nums[i];
            int req = prefixXor^k;

            count+= map.getOrDefault(req,0);

            map.put(prefixXor, map.getOrDefault(prefixXor, 0)+1);
        }

        return count;
    }
}
