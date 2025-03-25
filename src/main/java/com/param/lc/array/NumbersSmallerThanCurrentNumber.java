package com.param.lc.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@DSAProblem(
        name = "How Many Numbers Are Smaller Than the Current Number",
        number=1365,
        description = "Given an array nums of size n, return the majority element.",
        platform = "LeetCode"
)
public class NumbersSmallerThanCurrentNumber {
    public int[] solve(int[] nums) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<temp.length;i++){
            if(map.get(temp[i])==null){
                map.put(temp[i],i);
            }
        }

        int[] op = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            op[i]=map.get(nums[i]);
        }

        return op;
    }
}
