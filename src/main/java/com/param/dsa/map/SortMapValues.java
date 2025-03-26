package com.param.dsa.map;

import java.util.*;

public class SortMapValues {

    public Map<String,Integer> solve(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue()-o2.getValue());

        Map<String,Integer> lmap = new LinkedHashMap<>();
        list.stream().forEach(e->lmap.put(e.getKey(),e.getValue()));
        return lmap;
    }
}
