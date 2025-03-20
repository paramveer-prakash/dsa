package com.param.lc.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlusOneTest {

    @Test
    void useCase1(){
        int [] nums = new int[]{1,2,3};
        PlusOne plusOne = new PlusOne();
        assertArrayEquals(new int[]{1,2,4},plusOne.solve(nums));
    }
}
