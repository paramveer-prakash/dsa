package com.param.lc.pattern.twopointer;

public class RemoveDuplicatesInSortedArray {

    public int solve(int[] nums){
        if(nums.length==0)
            return 0;

        int x=0;

        for(int y=1;y<nums.length;y++){
            if(nums[x]!=nums[y]){
                x++;
                nums[x]=nums[y];
            }
        }

        return x+1;
    }
}
