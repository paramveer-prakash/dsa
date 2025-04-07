package com.param.designpattern.bridge;

public class PayPalGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment");
    }
}
