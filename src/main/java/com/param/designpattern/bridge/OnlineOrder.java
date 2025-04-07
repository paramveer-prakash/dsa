package com.param.designpattern.bridge;

public class OnlineOrder extends Order{


    public OnlineOrder(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    void checkout(double amount) {
        System.out.println("Online order placed ");
        paymentGateway.processPayment(amount);
    }
}
