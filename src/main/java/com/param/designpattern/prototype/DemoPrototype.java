package com.param.designpattern.prototype;

public class DemoPrototype {

    public static void main(String[] args) {
        Circle orignalCircle = new Circle(10,"Red");
        Circle clonedCircle = (Circle) orignalCircle.clone();
        orignalCircle.draw();
        clonedCircle.draw();
    }
}
