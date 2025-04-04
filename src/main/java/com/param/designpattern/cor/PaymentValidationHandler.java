package com.param.designpattern.cor;

public class PaymentValidationHandler extends OrderHandler{

    @Override
    protected boolean process(Order order) {
        System.out.println("Validating order payment ");

        //validate payment


        return Boolean.TRUE;
    }
}
