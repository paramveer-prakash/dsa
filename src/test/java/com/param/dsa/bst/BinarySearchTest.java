package com.param.dsa.bst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BinarySearchTest {

    @Test
    void testExactMatchFound(){
        List<Integer> numbers = List.of(1,3,5,7,9);
        Integer result  = new BinarySearch().binarySearch(numbers, 5,null,BinarySearchOperation.EXACT_MATCH);
        assertEquals(5,result);
    }

    @Test
    void testExactMatchNotFound(){
        List<Integer> numbers = List.of(1,3,5,7,9);
        Integer result  = new BinarySearch().binarySearch(numbers, 6,null,BinarySearchOperation.EXACT_MATCH);
        assertNull(result);
    }

    @Test
    void testFindClosestMatch(){
        List<Integer> numbers = List.of(1,3,5,7,9);
        Integer result  = new BinarySearch().binarySearch(numbers, 6,null,BinarySearchOperation.FIND_CLOSEST);
        assertEquals(5,result);
    }

}
