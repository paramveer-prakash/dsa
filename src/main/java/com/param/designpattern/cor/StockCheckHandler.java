package com.param.designpattern.cor;

public class StockCheckHandler extends OrderHandler{
    @Override
    protected boolean process(Order order) {
        System.out.println("Checking  stock for item: "+order.getItemId());

        //Order Checking

        return Boolean.TRUE;
    }
}
