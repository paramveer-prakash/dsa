package com.param.lc.dp;

import com.param.lc.strings.LongestSubstringWithoutRepeatingChar;

public class LongestCommonSubsequence {

    public int solveTopDown(String s1, String s2){

        //initialization
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] dp = new int[l1+1][l2+1];

        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                char c1 = s1.charAt(i-1);
                char c2 = s2.charAt(j-1);
                if(c1==c2){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(
                            dp[i][j-1],
                            dp[i-1][j]
                    );
                }
            }
        }

        return dp[l1][l2];
    }

    public int solveRecursive(String s1, String s2){
        //base condition
        if(s1.length()==0||s2.length()==0){
            return 0;
        }

        //choice diagram
        char s1c = s1.charAt(s1.length()-1);
        char s2c = s2.charAt(s2.length()-1);
        if(s1c==s2c){
            return 1+solveRecursive(s1.substring(0, s1.length() - 1), s2.substring(0, s2.length() - 1));
        }else{
            return Math.max(
                    solveRecursive(s1,s2.substring(0,s2.length()-1)),
                    solveRecursive(s1.substring(0,s1.length()-1),s2)
            );
        }
    }
}
