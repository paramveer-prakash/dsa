package com.param.designpattern.facade;

public class FacadeDemo {

    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        shoppingFacade.getInventory("123");
    }
}
