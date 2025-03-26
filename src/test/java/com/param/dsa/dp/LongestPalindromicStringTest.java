package com.param.dsa.dp;

import com.param.dsa.dp.LongestPalindromicString;
import org.junit.jupiter.api.Test;

public class LongestPalindromicStringTest {

    @Test
    void testCase1(){
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();
        assert "bab".equals(longestPalindromicString.solve("babad"));
    }
}
