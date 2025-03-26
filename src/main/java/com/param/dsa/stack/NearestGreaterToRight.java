package com.param.dsa.stack;

import java.util.*;

public class NearestGreaterToRight {

    public int[] solve(int[] nums){
        int[] op = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=nums.length-1;i>=0;i--){

            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            op[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }

        return op;

    }

    public static void main(String[] args) {
        NearestGreaterToRight nearestGreaterToRight = new NearestGreaterToRight();
        int[] op = nearestGreaterToRight.solve(new int[]{1,3,2,4});
        for(int i:op){
            System.out.println(i);
        }
    }
}
