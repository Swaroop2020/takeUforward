package org.example.problems;

public class Palindrome {

    // Parsing through all numbers
    public boolean isPalindrome(int n){
        if(n==0) return true;
        int reverse = 0;
        int original = n;
        while(n>0){
            reverse = (reverse*10)+(n%10);
            n=n/10;
        }

        return original==reverse;
    }

    public boolean isAPalindrome(int n){

        // Negative numbers are never palindrome
        // Numbers ending with 0 are also not palindrome
        // except 0 itself
        if(n<0 || (n%10==0 && n!=0)) return false;

        int reversedHalf = 0;

        // Here this will cut the number into half digits or reversedHalf having 1 digit more than half
        while(n>reversedHalf){
            reversedHalf = (reversedHalf * 10)+(n%10);
            n= n/10;
        }

        // For even digits: x == reversedHalf
        // For odd digits: x == reversedHalf/10
        return n==reversedHalf || n== reversedHalf/10;

    }
}
