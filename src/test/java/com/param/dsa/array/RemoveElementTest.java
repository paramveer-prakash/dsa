package com.param.dsa.array;

import com.param.dsa.array.RemoveElement;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    @Test
    void testCase1(){
        RemoveElement removeElement = new RemoveElement();

        assert 2 == removeElement.solve(new int[]{3,2,2,3},3);
    }
}
