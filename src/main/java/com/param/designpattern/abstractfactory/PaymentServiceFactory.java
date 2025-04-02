package com.param.designpattern.abstractfactory;

public interface PaymentServiceFactory {
    PaymentProcessor createPaymentProcessor();
    InvoiceGenerator createInvoiceGenerator();
}
