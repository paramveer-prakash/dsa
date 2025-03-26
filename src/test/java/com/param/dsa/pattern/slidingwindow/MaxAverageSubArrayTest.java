package com.param.dsa.pattern.slidingwindow;

import com.param.dsa.slidingwindow.MaxAverageSubArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxAverageSubArrayTest {

    @Test
    void shouldOutputValidResult(){
        MaxAverageSubArray maxAverageSubArray = new MaxAverageSubArray();
        assertEquals(12.75000, maxAverageSubArray.solve(new int[]{1,12,-5,-6,50,3},4));
    }

    @Test
    void shouldOutputInValidResult(){
        MaxAverageSubArray maxAverageSubArray = new MaxAverageSubArray();
        assertNotEquals(23, maxAverageSubArray.solve(new int[]{12,12,-5,-6,50,3},4));
    }
}
