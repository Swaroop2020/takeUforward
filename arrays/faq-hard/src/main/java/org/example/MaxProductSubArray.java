package org.example;

/**
 * Given an integer array nums. Find the subarray with the largest product, and return the product of the elements present in that subarray.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 * Example 1
 * Input: nums = [4, 5, 3, 7, 1, 2]
 * Output: 840
 *
 * Explanation:
 * The largest product is given by the whole array itself
 */
public class MaxProductSubArray {
    public int solution1(int[] nums) {

        int minProd = nums[0];
        int maxProd = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length; i++){
            int tempMin = Math.min(nums[i] , Math.min(nums[i]*maxProd, nums[i]*minProd));
            int tempMax = Math.max(nums[i], Math.max(nums[i]*minProd, nums[i]*maxProd));

            minProd = tempMin;
            maxProd = tempMax;

            result = Math.max(result, maxProd);

        }

        return result;
    }

    public int solution2(int[] nums) {

        int n = nums.length;

        int prefix = 1;
        int suffix = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++) {

            // left to right prefix product
            if (prefix == 0) prefix = 1;
            prefix *= nums[i];

            // right to left suffix product
            if (suffix == 0) suffix = 1;
            suffix *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        return ans;
    }
}
