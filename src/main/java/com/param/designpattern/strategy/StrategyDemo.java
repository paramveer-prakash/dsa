package com.param.designpattern.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        //Pay with card
        checkoutService.setPaymentStrategy(new CreditCardPayment());
        checkoutService.checkout(450);

        //Pay with PayPal
        checkoutService.setPaymentStrategy(new PayPalPayment());
        checkoutService.checkout(599);
    }
}
