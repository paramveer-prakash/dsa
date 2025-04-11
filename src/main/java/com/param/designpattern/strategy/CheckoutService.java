package com.param.designpattern.strategy;

public class CheckoutService {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount){
        if(paymentStrategy == null){
            throw new IllegalStateException("Payment strategy not set!");
        }
        paymentStrategy.pay(amount);
    }
}
