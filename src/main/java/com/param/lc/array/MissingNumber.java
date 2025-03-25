package com.param.lc.array;
@DSAProblem(
        name = "Missing Number",
        number=268,
        description = "Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.",
        platform = "LeetCode"
)
public class MissingNumber {

    public int solve(int[] nums) {
        int l = nums.length;
        int sum = (l*(l+1))/2;
        int actualSum = 0;

        for(int i=0;i<nums.length;i++){
            actualSum = actualSum+nums[i];
        }
        return sum-actualSum;
    }
}
