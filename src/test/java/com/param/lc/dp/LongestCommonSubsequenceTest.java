package com.param.lc.dp;

import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {

    @Test
    void testCase1(){
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "abcdgh";
        String s2 = "abedfh";
        assert 4 == lcs.solveTopDown(s1,s2);
    }
}
