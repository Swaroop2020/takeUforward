package org.example.problems;


public class GCD {

    /**
     * Euclidean algorithm.
     */
    public int calculate(int a, int b){

        while(b!=0){
            int temp = b;
            b = b%a;
            a = temp;
        }
        return a;
    }
}
