package org.example;

import org.example.basics.FibonacciWithMemoization;
import org.example.basics.FibonacciWithTabulation;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FibonacciWithMemoization fwm = new FibonacciWithMemoization();
        System.out.println(fwm.fib(10));

        FibonacciWithTabulation fwt = new FibonacciWithTabulation();
        System.out.println(fwt.fib(10));

    }
}