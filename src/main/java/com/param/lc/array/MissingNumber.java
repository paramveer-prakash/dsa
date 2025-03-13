package com.param.lc.array;

public class MissingNumber {

    public int solve(int[] nums) {
        int l = nums.length;
        int sum = (l*(l+1))/2;
        int actualSum = 0;

        for(int i=0;i<nums.length;i++){
            actualSum = actualSum+nums[i];
        }
        return sum-actualSum;
    }
}
