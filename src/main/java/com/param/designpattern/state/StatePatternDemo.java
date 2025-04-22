package com.param.designpattern.state;

public class StatePatternDemo {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnUp();
        fan.turnUp();
        fan.turnUp();
        fan.turnDown();
        fan.turnDown();
        fan.turnDown();
    }
}
