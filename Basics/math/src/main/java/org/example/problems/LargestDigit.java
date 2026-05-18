package org.example.problems;

public class LargestDigit {

    public int largestDigit(int n) {
        int max = 0;

        while(n>0){
            if(n%10>max) max = n%10;
            n=n/10;
        }
        return max;
    }
}
