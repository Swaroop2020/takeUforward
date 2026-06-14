package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Given an M * N matrix, print the elements in a clockwise spiral manner.
 *
 * Return an array with the elements in the order of their appearance when printed in a spiral manner.
 *
 * Example 1
 * Input: matrix = [[1, 2, 3], [4 ,5 ,6], [7, 8, 9]]
 * Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
 *
 * Explanation:
 * The elements in the spiral order are 1, 2, 3 -> 6, 9 -> 8, 7 -> 4, 5
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int size = matrix.length*matrix[0].length;

        int[] result = new int[size];
        int index = 0;

        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;

        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                result[index++] = matrix[top][i];
            }
            top++;

            for(int j = top; j<=bottom; j++){
                result[index++] = matrix[j][right];
            }
            right--;

            if(bottom>=top){
                for(int k = right; k>=left; k--){
                    result[index++] = matrix[bottom][k];
                }
                bottom--;
            }

            if(left<=right){
                for(int l = bottom; l>=top; l--){
                    result[index++] = matrix[l][left];
                }
                left++;
            }

        }

        return Arrays.stream(result).boxed().toList();

    }
}
