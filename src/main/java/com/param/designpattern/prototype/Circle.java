package com.param.designpattern.prototype;

public class Circle implements Prototype{

    private int radius;
    private String color;

    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(Circle circle){
        this.radius = circle.radius;
        this.color = circle.color;
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    public void draw(){
        System.out.println("Drawing Circle with "+color+" and radius "+radius);
    }
}
