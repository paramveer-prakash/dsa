package com.param.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(double newPrice){
        if(newPrice<this.price){
            this.price = newPrice;
            notifyObservers();
        }else {
            this.price = newPrice;
        }
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(name,price);
        }
    }
}
