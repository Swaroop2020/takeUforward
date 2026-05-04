package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 */
public class Pattern8 {

    public void build(int n){
        for(int i=0; i<n; i++){

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int k=0; k<(2*(n-i)-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
