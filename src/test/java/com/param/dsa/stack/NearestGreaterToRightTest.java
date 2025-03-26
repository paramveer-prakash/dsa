package com.param.dsa.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NearestGreaterToRightTest {

    @Test
    void test(){
        NearestGreaterToRight nearestGreaterToRight = new NearestGreaterToRight();
        assertArrayEquals(new int[]{3,4,4,-1},nearestGreaterToRight.solve(new int[]{1,3,2,4}));
    }
}
