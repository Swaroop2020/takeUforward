package org.example.pkg1;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousSmallerElement {

    public int[] previousSmaller(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        return result;
    }
}
