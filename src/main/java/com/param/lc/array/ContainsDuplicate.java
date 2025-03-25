package com.param.lc.array;

import java.util.HashSet;
import java.util.Set;

@DSAProblem(
        name = "Contains Duplicate",
        number=217,
        description = "Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.",
        platform = "LeetCode"
)
public class ContainsDuplicate {

    public boolean solve(int[] nums){
        Set<Integer> inps = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            if(!inps.add(nums[i])){
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }
}
