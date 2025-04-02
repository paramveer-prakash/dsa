package com.param.designpattern.abstractfactory;

public class DemoAbstractFactory {
    public static void main(String[] args) {
        String paymentGateway = "paypal";

        PaymentServiceFactory factory = switch (paymentGateway){
            case "paypal"->new PaypalPaymentServiceFactory();
            case "stripe"->new StripePaymentServiceFactory();
            default -> throw new IllegalArgumentException("Unsupported Payment Gateway");
        };

        CheckoutService checkoutService = new CheckoutService(factory);
        checkoutService.checkout("O1234",299.00);
    }
}
