package com.param.designpattern.decorator;

public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    public double getCost() {
        return coffee.getCost() + 1.5;
    }
}
