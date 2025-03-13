package com.param.lc.array;

import java.util.HashSet;
import java.util.Set;

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
