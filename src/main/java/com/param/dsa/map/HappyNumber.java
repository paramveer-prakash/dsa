package com.param.dsa.map;

import java.util.HashSet;
import java.util.Set;
import com.param.annotation.DSAProblem;

@DSAProblem(
        name = "Happy Number",
        number=202,
        description = "Write an algorithm to determine if a number n is happy.",
        platform = "LeetCode"
)
public class HappyNumber {

    public boolean solve(int n){

        int x = n;

        Set<Integer> ex = new HashSet<>();
        while(true){
            int currentSum = 0;
            while(x>0){
                int s = x%10;
                currentSum=currentSum+(s*s);
                x=x/10;
            }
            if(currentSum==1){
                return true;
            }else if(ex.contains(currentSum)){
                return false;
            }
            ex.add(currentSum);
            x= currentSum;

        }
    }
}
