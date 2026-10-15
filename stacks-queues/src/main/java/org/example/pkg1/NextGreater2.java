package org.example.pkg1;

import java.util.ArrayDeque;
import java.util.Deque;

// this si for circular array
public class NextGreater2 {

    public int[] nextGreater(int[] arr){

        int n = arr.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=2*n-1; i>=0; i--){
            int index = i%n;

            while(!stack.isEmpty() && stack.peek()<=arr[index]){
                stack.pop();
            }

            result[index] = stack.isEmpty()? -1: stack.peek();

            stack.push(arr[index]);
        }
        return result;
    }
}
