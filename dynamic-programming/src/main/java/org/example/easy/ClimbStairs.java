package org.example.easy;

import java.util.Arrays;

public class ClimbStairs {

    int climb(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    int solve(int n, int[] dp){

        if(n<=1){
            return 1;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n] = dp[n-1]+dp[n-2];
        return dp[n];
    }
}
