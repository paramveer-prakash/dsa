package com.param.designpattern.state;

public class OffState implements FanState{

    @Override
    public void turnUp(Fan fan) {
        System.out.println("Turning fan to Low Speed.");
        fan.setState(new LowSpeedState());
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("Fan is already Off.");
    }
}
