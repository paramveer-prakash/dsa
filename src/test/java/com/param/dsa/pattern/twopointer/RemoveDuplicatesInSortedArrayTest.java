package com.param.dsa.pattern.twopointer;

import com.param.dsa.twopointer.RemoveDuplicatesInSortedArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesInSortedArrayTest {

    @Test
    void shouldReturnValidOutput(){
        RemoveDuplicatesInSortedArray removeDuplicatesInSortedArray = new RemoveDuplicatesInSortedArray();
        assertEquals(2, removeDuplicatesInSortedArray.solve(new int[]{1,1,1,2,2}));
    }
}
