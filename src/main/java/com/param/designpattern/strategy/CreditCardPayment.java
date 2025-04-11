package com.param.designpattern.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount+" with CreditCard");
    }
}
