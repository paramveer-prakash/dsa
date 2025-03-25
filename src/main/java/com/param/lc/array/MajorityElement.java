package com.param.lc.array;

import java.util.HashMap;
import java.util.Map;

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
