package com.param.designpattern.state;

public class HighSpeedState implements FanState{

    @Override
    public void turnUp(Fan fan) {
        System.out.println("Fan is already at High Speed.");
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("Turning fan to Low Speed.");
        fan.setState(new LowSpeedState());
    }
}
