package com.param.designpattern.abstractfactory;

public class CheckoutService {
    private final PaymentProcessor paymentProcessor;
    private final InvoiceGenerator invoiceGenerator;

    public CheckoutService(PaymentServiceFactory factory){
        this.paymentProcessor = factory.createPaymentProcessor();
        this.invoiceGenerator = factory.createInvoiceGenerator();
    }

    public void checkout(String orderId, double amount){
        paymentProcessor.processPayment(amount);
        invoiceGenerator.generateInvoice(orderId);
    }
}
