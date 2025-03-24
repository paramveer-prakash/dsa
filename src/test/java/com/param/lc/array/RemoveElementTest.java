package com.param.lc.array;

import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    @Test
    void testCase1(){
        RemoveElement removeElement = new RemoveElement();

        assert 2 == removeElement.solve(new int[]{3,2,2,3},3);
    }
}
