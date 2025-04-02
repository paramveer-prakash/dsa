package com.param.designpattern.abstractfactory;

public class StripePaymentServiceFactory implements PaymentServiceFactory{
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new StripePaymentProcessor();
    }

    @Override
    public InvoiceGenerator createInvoiceGenerator() {
        return new StripeInvoiceGenerator();
    }
}
