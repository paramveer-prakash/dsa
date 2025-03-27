package com.param.dsa.map;

import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    @Test
    void positiveTestCase(){
        HappyNumber h = new HappyNumber();
        assert h.solve(19);
    }

    @Test
    void negativeTestCase(){
        HappyNumber h = new HappyNumber();
        assert h.solve(2);
    }
}
