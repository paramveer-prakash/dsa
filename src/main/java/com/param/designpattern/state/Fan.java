package com.param.designpattern.state;

public class Fan {
    private FanState state;

    public Fan(){
        this.state = new OffState();
    }

    public void setState(FanState fanState){
        this.state=fanState;
    }

    public void turnUp(){
        this.state.turnUp(this);
    }

    public void turnDown(){
        this.state.turnDown(this);
    }
}
