package org.example;

import org.example.problems.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        LargestDigit largestDigit = new LargestDigit();
        Factorial factorial = new Factorial();
        ArmStrong armStrong = new ArmStrong();
        PerfectNumber perfectNumber = new PerfectNumber();
        PrimeNumber primeNumber = new PrimeNumber();
        PrimeUpToN primeUpToN = new PrimeUpToN();
        GCD gcd = new GCD();
        LCM lcm = new LCM();
        DivisorsOfANumber dvn= new DivisorsOfANumber();

        print();
        int n = 12321;
        System.out.println("Is a palindrome "+n+"  "+palindrome.isAPalindrome(n));
        print();
        System.out.println("Largest digit in "+n+" is  : "+largestDigit.largestDigit(n));
        print();
        System.out.println("Factorial of "+n+" is : "+factorial.calculate(n));
    }


    private static void print(){
        System.out.println("----------------------------------------------------------------------");
    }
}