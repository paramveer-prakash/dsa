package com.param.designpattern.bridge;

public abstract class Order {

    protected PaymentGateway paymentGateway;

    public Order(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    abstract void checkout(double amount);
}
