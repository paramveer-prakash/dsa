package com.param.dsa.map;

import org.junit.jupiter.api.Test;

public class RansomNoteTest {

    @Test
    void positiveTestCase(){
        RansomNote ransomNote = new RansomNote();
        assert ransomNote.solve("aa","aab");
    }
}
