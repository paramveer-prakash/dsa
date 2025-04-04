package com.param.designpattern.cor;

public class OrderProcessor {

    public static void main(String[] args) {
        OrderHandler handlerChain = new StockCheckHandler();
        handlerChain.setNext(new PaymentValidationHandler());


        //Sample Order
        Order order = new Order();
        order.setUserId("Param");
        order.setItemId("Item1");
        order.setQuantity(1);
        order.setPaymentMethod("CC");
        order.setShippingAddress("123 Main st");

        handlerChain.handle(order);
    }
}
