package org.example.patterns;

/**
 *Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 *
 *
 * *
 * **
 * ***
 * ****
 * *****
 *
 */
public class Pattern2 {

    public void printRightTriangle(int n) {

        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
