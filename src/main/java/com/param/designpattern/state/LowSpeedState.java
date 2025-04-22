package com.param.designpattern.state;

public class LowSpeedState implements FanState{


    @Override
    public void turnUp(Fan fan) {
        System.out.println("Turning fan to High Speed.");
        fan.setState(new HighSpeedState());
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("Turning fan Off.");
        fan.setState(new OffState());
    }
}
