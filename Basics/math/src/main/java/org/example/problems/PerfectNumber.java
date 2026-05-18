package org.example.problems;

public class PerfectNumber {

    /**
     * A number would be divisable by all the pairs found till the root
     */
    public boolean isPerfectOptimized(int n){
        if (n <= 1)
            return false;

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public boolean isPerfect(int n) {

        if (n <= 1)
            return false;

        int sum = 1;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

}