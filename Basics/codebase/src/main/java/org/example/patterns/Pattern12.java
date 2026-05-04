package org.example.patterns;

/**
 * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
 *
 *
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 */
public class Pattern12 {
    public void build(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                printNum(i,j);
            }

            for(int j=n;j>=1;j--){
                printNum(i,j);
            }
            System.out.println();
        }
    }
    public void printNum(int i, int j){
        if(j<=i)
        {
            System.out.print(j);
        }else{
            System.out.print(" ");
        }
    }
}
