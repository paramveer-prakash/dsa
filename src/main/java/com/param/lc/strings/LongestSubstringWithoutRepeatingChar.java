package com.param.lc.strings;

public class LongestSubstringWithoutRepeatingChar {
    public int solve(String s){
        if(s.length()==0){
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int len=0;

        StringBuilder sb = new StringBuilder(s.charAt(0));
        int l=0,r=1;
        while(r<s.length() && l<r){
            char ch = s.charAt(r);
            int idx = sb.indexOf(String.valueOf(ch));
            if(idx<0){
                sb.append(ch);
                r++;
                len = Math.max(len,sb.length());
            }else{
                sb = new StringBuilder(sb.substring(idx+1));
                l = idx+1;
            }
        }

        return len;
    }
}
