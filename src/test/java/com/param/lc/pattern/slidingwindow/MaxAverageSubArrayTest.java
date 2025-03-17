package com.param.lc.pattern.slidingwindow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxAverageSubArrayTest {

    @Test
    void shouldOutputValidResult(){
        MaxAverageSubArray maxAverageSubArray = new MaxAverageSubArray();
        assertEquals(12.75000, maxAverageSubArray.solve(new int[]{1,12,-5,-6,50,3},4));
    }
}
