package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class Paranthesis {

    List<String> generateParanthesis(int n){
        List<String> result = new ArrayList<>();

        solve(0,0,n,"", result);
        return  result;
    }

    void solve(int open, int close, int n,String current, List<String> result){

        if(open == n && close == n){
            result.add(current);
            return;
        }

        if(open<n){
            solve(open+1, close, n, current+"(", result);
        }

        if(close<open){
            solve(open, close+1, n, current+")", result);
        }
    }


}
