package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 * *****
 * ****
 * ***
 * **
 * *
 *
 */
public class Pattern5 {

    public void build(int n) {

        for(int i=n; i>0; i--){

            for(int j=0; j<i; j++){

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
