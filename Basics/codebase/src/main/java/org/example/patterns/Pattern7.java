package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Pattern7 {

    public void buildPyramid(int n){
        for(int i=0;i<n;i++){

            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
