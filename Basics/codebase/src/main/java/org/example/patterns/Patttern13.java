package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 */
public class Patttern13 {

    public void build(int n){
        int k=1;

        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }

    /**
     * If k is banned
     */
    public void build2(int n){
        for (int i = 1; i <= n; i++) {

            int start = (i * (i - 1)) / 2 + 1;

            for (int j = 0; j < i; j++) {
                System.out.print((start + j) + " ");
            }

            System.out.println();
        }
    }
}
