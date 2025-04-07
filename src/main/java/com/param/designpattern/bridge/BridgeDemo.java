package com.param.designpattern.bridge;

/*
Bridge Pattern is a structural design pattern that decouples an abstraction
from its implementation so that the two can vary independently.
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Order onlineOrder = new OnlineOrder(new PayPalGateway());
        onlineOrder.checkout(159);

        Order codorder = new CoDOrder(new PayPalGateway());
        codorder.checkout(399);
    }
}
