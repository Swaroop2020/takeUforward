package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return the first n (1-Indexed) rows of Pascal's triangle.
 *
 * In Pascal's triangle:
 * The first row has one element with a value of 1.
 * Each row has one more element in it than its previous row.
 * The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.
 *
 * Example 1
 * Input: n = 4
 * Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]
 *
 * Explanation: The Pascal's Triangle is as follows:
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1st Row has its value set to 1.
 *
 * All other cells take their value as the sum of the values directly above them
 */
public class Pascal3 {

    public List<List<Integer>> pascalTriangleIII(int n) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            int res = 1;
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                row.add(res);
                res = res * (i-j)/(j+1);
            }
            list.add(row);

        }
        return list;

    }
}
