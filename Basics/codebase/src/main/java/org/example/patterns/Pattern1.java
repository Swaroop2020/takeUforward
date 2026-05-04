package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N.
 * Let's say for N = 5, the pattern should look like as below:
 *
 * *****
 * *****
 * *****
 * *****
 * *****
 *
 *
 */
public class Pattern1 {

    /**
     * This has a time-complexity of O(n^2)
     * @param n
     */
    public void build(int n){
        for(int i=1;i<=n*n;i++){
            System.out.print("*");
            if(i%n == 0){
                System.out.println();
            }
        }
    }

    /**
     * Even this is O(n^2)
     * println internally iterates over each character to print
     * like printing 1 character at a time
     *
     * @param n
     */
    public void build2(int n){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append("*");
        }

        for (int i=0; i<n; i++){
            System.out.println(sb);
        }
    }


}
