package com.param.lc.array;

public class PlusOne {

    public int[] solve(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
