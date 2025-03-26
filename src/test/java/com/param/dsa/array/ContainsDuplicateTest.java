package com.param.dsa.array;

import com.param.dsa.array.ContainsDuplicate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {

    @Test
    void shouldReturnTrueForValidInput(){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertTrue(containsDuplicate.solve(new int[]{1,2,3,1}));
        assertFalse(containsDuplicate.solve(new int[]{1,2,3,4}));
        assertTrue(containsDuplicate.solve(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
