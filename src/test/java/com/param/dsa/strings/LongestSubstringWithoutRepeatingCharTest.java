package com.param.dsa.strings;

import com.param.dsa.strings.LongestSubstringWithoutRepeatingChar;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharTest {

    @Test
    void test1(){
        LongestSubstringWithoutRepeatingChar lswrc = new LongestSubstringWithoutRepeatingChar();
        assert 3==lswrc.solve("dvdf");
    }
}
