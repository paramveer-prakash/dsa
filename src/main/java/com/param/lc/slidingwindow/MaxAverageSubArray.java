package com.param.lc.slidingwindow;

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
