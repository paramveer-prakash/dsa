package com.param.lc.strings;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharTest {

    @Test
    void test1(){
        LongestSubstringWithoutRepeatingChar lswrc = new LongestSubstringWithoutRepeatingChar();
        assert 3==lswrc.solve("dvdf");
    }
}
