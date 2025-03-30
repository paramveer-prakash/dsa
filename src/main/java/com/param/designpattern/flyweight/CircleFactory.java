package com.param.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {
    private static final Map<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
       Circle c = circleMap.get(color);
       if(c==null){
           c = new ConcreteCircle(color);
           circleMap.put(color, c);
           System.out.println("Creating a "+color +" circle");
       }
       return c;
    }
}
