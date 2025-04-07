package com.param.designpattern.bridge;

public class CoDOrder extends Order{

    public CoDOrder(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    void checkout(double amount) {
        System.out.println("CoD order placed");
        paymentGateway.processPayment(amount);
    }
}
