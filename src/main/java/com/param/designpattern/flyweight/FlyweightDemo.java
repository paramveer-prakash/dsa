package com.param.designpattern.flyweight;

public class FlyweightDemo {

    private static final String[] colors = {"Red","Green"};
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            Circle c = CircleFactory.getCircle(colors[(int)(Math.random()*colors.length)]);
            c.setPosition((int) (Math.random()*100), (int) (Math.random()*100));
            c.draw();
        }
    }
}
