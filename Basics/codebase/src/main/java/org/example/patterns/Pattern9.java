package org.example.patterns;

/**
 *Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Pattern9 {

    public void build(int n){
        for(int i=0;i<n;i++) {
            printRow(n - i - 1, 2*i+1);
        }

        for(int i=0;i<n;i++){
            printRow(i, 2*(n-i)-1);
        }
    }

    public void printRow(int spaces, int stars){

        for(int i=0;i<spaces;i++){
            System.out.print(" ");
        }

        for(int i=0; i<stars; i++){
            System.out.print("*");
        }
        System.out.println();
    }

}
