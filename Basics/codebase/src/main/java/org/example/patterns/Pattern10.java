package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 * -----
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 *
 */
public class Pattern10 {

    public void build(int n){
        for(int i = 1; i <= 2 * n - 1; i++){

            int stars = (i <= n) ? i : 2 * n - i;

            printRow(stars);
        }
    }

    public void printRow(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }

}
