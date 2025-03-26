package com.param.dsa.pattern.prefixsum;

import com.param.dsa.prefixsum.MinSizeSubArraySum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MinSizeSubArraySumTest {

    @Test
    void shouldOutPutValidArraySize(){
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();

        assertEquals(2, minSizeSubArraySum.solve(new int[]{2,3,1,2,4,3},7));
    }
}
