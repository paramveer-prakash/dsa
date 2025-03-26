package com.param.dsa.array;

import com.param.annotation.DSAProblem;

@DSAProblem(
        name = "Remove Element",
        number=27,
        description = "Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val",
        platform = "LeetCode"
)
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
