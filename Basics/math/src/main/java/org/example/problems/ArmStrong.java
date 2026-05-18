package org.example.problems;

/**
 * An armstrong number is a number which is equal to the sum of the digits of the number,
 * raised to the power of the number of digits.
 */
public class ArmStrong {

    public boolean isArmstrong(int n) {

        int original = n;
        int digits = String.valueOf(n).length();

        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += Math.pow(digit, digits);
            n=n/10;
        }

        return sum==original;
    }

}
