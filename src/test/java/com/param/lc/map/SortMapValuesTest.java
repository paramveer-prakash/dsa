package com.param.lc.map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class SortMapValuesTest {

    @Test
    void test(){
        SortMapValues sortMapValues = new SortMapValues();
        Map<String,Integer> amap =  Map.of("a",20,"b",10,"c",50,"d",40);
        Map<String,Integer> emap =  Map.of("b",10,"a",20,"d",40,"c",50);

        assertEquals(emap,sortMapValues.solve(amap));
    }
}
