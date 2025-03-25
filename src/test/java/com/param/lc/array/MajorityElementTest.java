package com.param.lc.array;

import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    @Test
    void testCase1(){
        MajorityElement majorityElement = new MajorityElement();

        assert 3 == majorityElement.solve(new int[]{3,1,2,3});
    }
}
