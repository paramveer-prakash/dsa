package com.param.dsa.array;

import com.param.annotation.DSAProblem;

import java.util.HashMap;
import java.util.Map;

@DSAProblem(
        name = "Majority Element",
        number=169,
        description = "Given an array nums of size n, return the majority element.",
        platform = "LeetCode"
)
public class MajorityElement {

    public int solve(int[] nums) {
        int maxfreq=-1;
        int elem = -1;
        Map<Integer,Integer> fm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer freq = fm.get(nums[i]);
            if(freq == null){
                freq=1;
                fm.put(nums[i],freq);
            }else{
                freq = freq+1;
                fm.put(nums[i],freq+1);
            }
            if(freq>maxfreq){
                maxfreq = freq;
                elem=nums[i];
            }
        }
        return elem;
    }
}
