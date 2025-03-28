package com.param.dsa.map;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FindWordsThatCanBeFormedByCharactersTest {

    @Test
    void positiveTest(){
        FindWordsThatCanBeFormedByCharacters f = new FindWordsThatCanBeFormedByCharacters();
        assert 6 == f.solve(new String[]{"cat","bt","hat","tree"},"attach");
    }
}
