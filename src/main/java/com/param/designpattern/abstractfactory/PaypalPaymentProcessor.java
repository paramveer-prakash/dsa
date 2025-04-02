package com.param.designpattern.abstractfactory;

public class PaypalPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment via paypal for $"+amount);
    }
}
