package com.param.dsa.sorts;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MergeSortTest {

    @Test
    void shouldSortValidArray(){
        int[] nums = new int[]{8,1,2,2,3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(nums);
        assertArrayEquals(new int[]{1,2,2,3,8},nums);
    }
}
