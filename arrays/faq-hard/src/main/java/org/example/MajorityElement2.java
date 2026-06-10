package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.
 *
 *
 * Example 1
 * Input: nums = [1, 2, 1, 1, 3, 2]
 * Output: [1]
 *
 * Explanation:
 * Here, n / 3 = 6 / 3 = 2.
 * Therefore the elements appearing 3 or more times is : [1]
 *
 */
public class MajorityElement2 {

    public List<Integer> majorityElementTwo(int[] nums) {

        int cand1 =0, cand2=1, count1=0, count2 = 0;
        int n = nums.length;

        for(int num : nums){
            if(cand1 == num){
                count1++;
            } else if (cand2 == num) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1++;
            } else if (count2 == 0){
                cand2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 =0;
        count2 = 0;

        for (int num : nums){
            if(num == cand1){
                count1++;
            }
            if(num == cand2){
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if(count1 > n/3)
            result.add(cand1);
        if(count2 > n/3)
            result.add(cand2);

        return result;
    }
}
