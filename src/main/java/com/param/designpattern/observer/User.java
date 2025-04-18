package com.param.designpattern.observer;

public class User implements Observer{

    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String productName, double newPrice) {
        System.out.println("Hey "+name+" ! The price of "+productName+" just dropped to "+newPrice);
    }
}
