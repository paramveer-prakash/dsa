package com.param.lc.dp;

import org.junit.jupiter.api.Test;

public class LongestPalindromicStringTest {

    @Test
    void testCase1(){
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();
        assert "bab".equals(longestPalindromicString.solve("babad"));
    }
}
