package com.param.designpattern.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        System.out.println("Order: "+coffee.getDescription());
        System.out.println("Total cost: "+coffee.getCost());
    }
}
