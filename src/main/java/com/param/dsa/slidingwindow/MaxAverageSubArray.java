package com.param.dsa.slidingwindow;

import com.param.annotation.DSAProblem;

@DSAProblem(
        name = "Maximum Average Subarray",
        number=209,
        description = "You are given an integer array nums consisting of n elements, and an integer k. Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.",
        platform = "LeetCode"
)
public class MaxAverageSubArray {

    public double solve(int[] nums, int k) {

        int x=0;
        int y=k;

        double maxSum=0;
        for(int i=0;i<y;i++){
            maxSum=maxSum+nums[i];
        }

        double lastSum = maxSum;
        while(y<nums.length){
            lastSum = lastSum+nums[y++]-nums[x++];
            if(lastSum>maxSum){
                maxSum=lastSum;
            }
        }

        return maxSum/k;
    }
}
