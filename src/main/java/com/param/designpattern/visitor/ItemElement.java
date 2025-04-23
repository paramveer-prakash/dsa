package com.param.designpattern.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
