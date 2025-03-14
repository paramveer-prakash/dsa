package com.param.lc.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisappearedNumbersTest {

    @Test
    void testValidInput(){
        DisappearedNumbers disappearedNumbers = new DisappearedNumbers();
        assertArrayEquals(new Object[]{5,6},disappearedNumbers.solve(new int[]{4,3,2,7,8,2,3,1}).toArray());
    }
}
