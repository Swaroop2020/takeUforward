package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 *
 */
public class Pattern14 {

    public void build(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}
