package com.param.dsa.map;

import org.junit.jupiter.api.Test;

public class IsoMorphicStringsTest {

    @Test
    void testPositive(){
        IsoMorphicStrings isoMorphicStrings = new IsoMorphicStrings();
        assert isoMorphicStrings.solve("paper","title");
    }

    @Test
    void testNegetive(){
        IsoMorphicStrings isoMorphicStrings = new IsoMorphicStrings();
        assert !isoMorphicStrings.solve("foo","bar");
    }
}
