package com.param.designpattern.abstractfactory;

public class PaypalInvoiceGenerator implements InvoiceGenerator{
    @Override
    public void generateInvoice(String orderId) {
        System.out.println("Invoice by paypal for order id"+orderId);
    }
}
