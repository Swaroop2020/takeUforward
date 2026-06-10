package org.example;

import java.math.BigInteger;

/**
 * Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
 *
 * Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
 *
 *
 * Note: You are not allowed to modify the original array.
 *
 * Example 1
 * Input: nums = [3, 5, 4, 1, 1]
 * Output: [1, 2]
 *
 * Explanation:
 * 1 appears two times in the array and 2 is missing from nums
 *
 */
public class RepeatingAndMissingNumber {
    public int[] findMissingRepeatingNumbers(int[] nums) {

        int n = nums.length;

        BigInteger bigN = BigInteger.valueOf(n);
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;
        BigInteger six = BigInteger.valueOf(6);

        BigInteger expectedSum = bigN.multiply(bigN.add(one)).divide(two);

        BigInteger actualSum = BigInteger.valueOf(0);

        BigInteger expectedSqSum = bigN.multiply(bigN.add(one)).multiply(two.multiply(bigN).add(one)).divide(six);

        BigInteger actualSqSum = BigInteger.valueOf(0);

        for(int num: nums){
            actualSum = actualSum.add(BigInteger.valueOf(num));
            actualSqSum = actualSqSum.add(BigInteger.valueOf(num).multiply(BigInteger.valueOf(num)));
        }


        BigInteger sqDiff = actualSqSum.subtract(expectedSqSum);

        BigInteger diff = actualSum.subtract(expectedSum);

        BigInteger sum = sqDiff.divide(diff);

        BigInteger a = diff.add(sum).divide(two);

        BigInteger b = sum.subtract(a);

        return new int[]{a.intValue(), b.intValue()};
    }
}
