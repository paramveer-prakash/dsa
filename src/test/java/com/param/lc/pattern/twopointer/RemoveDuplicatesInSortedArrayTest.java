package com.param.lc.pattern.twopointer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesInSortedArrayTest {

    @Test
    void shouldReturnValidOutput(){
        RemoveDuplicatesInSortedArray removeDuplicatesInSortedArray = new RemoveDuplicatesInSortedArray();
        assertEquals(2, removeDuplicatesInSortedArray.solve(new int[]{1,1,1,2,2}));
    }
}
