package com.param.designpattern.abstractfactory;

public class PaypalPaymentServiceFactory implements PaymentServiceFactory{
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PaypalPaymentProcessor();
    }

    @Override
    public InvoiceGenerator createInvoiceGenerator() {
        return new PaypalInvoiceGenerator();
    }
}
