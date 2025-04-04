package com.param.designpattern.cor;

public abstract class OrderHandler {

    protected OrderHandler next;

    public OrderHandler setNext(OrderHandler next){
        this.next=next;
        return next;
    }

    public void handle(Order order){
        if(process(order)&& next != null){
            next.handle(order);
        }
    }

    protected abstract boolean process(Order order);
}
