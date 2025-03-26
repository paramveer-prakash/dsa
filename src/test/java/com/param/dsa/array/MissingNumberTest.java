package com.param.dsa.array;

import com.param.dsa.array.MissingNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {

    @Test
    void shouldReturnValidMissingNumber(){
        MissingNumber missingNumber = new MissingNumber();
        assertEquals(1,missingNumber.solve(new int[]{0,2}));
        assertEquals(5,missingNumber.solve(new int[]{0,1,2,3,4,6}));
    }
}
