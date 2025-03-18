package com.param.lc.pattern.prefixsum;

public class MinSizeSubArraySum {

    public int solve(int[] nums,int target) {

        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        if(prefix[0]>=target){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        int l=0,r=1,minSize = Integer.MAX_VALUE;

        while(r<prefix.length && l<=r){
            int sum = prefix[r]-(l==0?0:prefix[l-1]);
            if(sum>=target){
                minSize=Math.min(minSize,r-l+1);
                l=l+1;
            }else{
                r++;
            }
        }

        if(minSize>nums.length)
            return 0;
        return minSize;
    }
}
