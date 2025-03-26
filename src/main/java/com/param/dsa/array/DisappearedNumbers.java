package com.param.dsa.array;

import com.param.annotation.DSAProblem;

import java.util.ArrayList;
import java.util.List;

@DSAProblem(
        name = "Find All Numbers Disappeared in an Array",
        number=448,
        description = "Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.",
        platform = "LeetCode"
)
public class DisappearedNumbers {

    public List<Integer> solve(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]-1]=1;
        }
        List<Integer> olist = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(temp[i]==0){
                olist.add(i+1);
            }
        }
        return olist;
    }

}
