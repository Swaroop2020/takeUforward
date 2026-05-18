package org.example.problems;

public class LCM {

    /**
     *  formula LCM = a*b/gcd(a,b);
     */
    public int calculate(int a, int b){
        int gcd = gcd(a,b);
        return (a*b)/gcd;
    }

    private int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a%b;
            a = b;
        }
        return a;
    }
}
