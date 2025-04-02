package com.param.designpattern.abstractfactory;

public class StripePaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment via Stripe: $"+amount);
    }
}
