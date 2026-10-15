package org.example.pkg1;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElement {

    public int[] nextGreater(int[] arr){

        int n = arr.length;
        Deque<Integer> stack =  new ArrayDeque<>();
        int[] result = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }

            result[i] = stack.isEmpty()?-1:stack.peek();

            stack.push(arr[i]);
        }

        return result;
    }
}
