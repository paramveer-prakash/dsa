package com.param.lc.array;

import java.util.ArrayList;
import java.util.List;

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
