package com.param.lc.array;

public class RemoveElement {

    public int solve(int[] nums, int val) {
        int fidx=-1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                if(fidx==-1){
                    fidx=i;
                }
                c++;
            }else{
                if(fidx>-1){
                    nums[fidx]=nums[i];
                    nums[i]=val;
                    fidx=fidx+1;
                }
            }
        }
        return nums.length-c;
    }
}
