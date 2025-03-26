package com.param.dsa.array;

import com.param.dsa.array.NumbersSmallerThanCurrentNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersSmallerThanCurrentNumberTest {

    @Test
    void shouldReturnValidOutput(){
        NumbersSmallerThanCurrentNumber numbersSmallerThanCurrentNumber = new NumbersSmallerThanCurrentNumber();

        assertArrayEquals(new int[]{4,0,1,1,3},numbersSmallerThanCurrentNumber.solve(new int[]{8,1,2,2,3}));
    }
}
