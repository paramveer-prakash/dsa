package com.param.designpattern.strategy;

public class PayPalPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount+" with PayPal");
    }
}
