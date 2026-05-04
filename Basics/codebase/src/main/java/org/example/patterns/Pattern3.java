package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 */
public class Pattern3 {

    public void build(int n) {

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }

}
