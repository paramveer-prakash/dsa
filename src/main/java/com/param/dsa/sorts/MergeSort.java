package com.param.dsa.sorts;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] nums){
        if(nums.length>1){
            int mid = nums.length/2;
            int[] left = Arrays.copyOfRange(nums,0,mid);
            int[] right = Arrays.copyOfRange(nums,mid,nums.length);

            sort(left);
            sort(right);
            mergeSortedArrays(nums,left,right);
        }
    }

    private void mergeSortedArrays(int nums[], int[] left, int[] right){
        int l=0,r=0,m=0;
        while(l<left.length && r<right.length){
            int leftn=left[l];
            int rightn=right[r];
            if(leftn<rightn){
                nums[m]=leftn;
                l++;
            }else{
                nums[m]=rightn;
                r++;
            }
            m++;
        }

        while(l<left.length){
            nums[m++]=left[l++];
        }

        while(r<right.length){
            nums[m++]=right[r++];
        }
    }
}
