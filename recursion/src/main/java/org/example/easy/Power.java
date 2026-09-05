package org.example.easy;

public class Power {

    public double myPow(double x, int n){

        if(n==0){
            return 1;
        }

        if(n<0){
            // This is to handle the max integer val. because if 2^-31 is converted to
            //2^31 it goes out of range for integer.
            return 1/x * myPow(x,-(n+1));
        }

        double half = myPow(x, n/2);

        if(n%2 == 0){
            return half * half;
        }

        return half*half*x;
    }
}
