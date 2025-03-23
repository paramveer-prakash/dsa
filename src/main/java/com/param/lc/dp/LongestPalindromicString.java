package com.param.lc.dp;

public class LongestPalindromicString {

    public String solve(String s) {
        String text1 = s;
        String text2 = new StringBuilder(s).reverse().toString();
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1+1][l2+1];
        int maxLength = 0;
        int endIndex = 0; // end index of the palindrome in original string
        for(int i=0;i<=l1;i++){
            for(int j=0;j<=l2;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else{

                    char c1 = text1.charAt(i-1);
                    char c2 = text2.charAt(j-1);
                    if(c1==c2){
                        dp[i][j]=1+dp[i-1][j-1];

                        // Calculate the original start and end positions to validate palindrome
                        int originalStart = i - dp[i][j];
                        int reverseStart = l1 - j;

                        // Check if substring aligns correctly (to be a valid palindrome)
                        if (originalStart == reverseStart) {
                            if (dp[i][j] > maxLength) {
                                maxLength = dp[i][j];
                                endIndex = i; // i is 1-based index in dp
                            }
                        }
                    }else{
                        dp[i][j] = 0;
                    }
                }
            }
        }
        String longestPalindrome = s.substring(endIndex - maxLength, endIndex);
        return longestPalindrome;
    }
}
