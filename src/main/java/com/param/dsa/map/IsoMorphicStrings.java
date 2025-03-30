package com.param.dsa.map;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {


    public boolean solve(String s, String t) {

        Map<Character,Character> sm = new HashMap<>();


        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sm.containsKey(sc)) {
                if (sm.get(sc) != tc) return false;
            }else if (sm.containsValue(tc)){
                return false;
            }else {
                sm.put(sc,tc);
            }
        }

        return true;
    }
}
