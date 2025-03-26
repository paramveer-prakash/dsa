package com.param.dsa.array;

import com.param.dsa.array.PlusOne;
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
