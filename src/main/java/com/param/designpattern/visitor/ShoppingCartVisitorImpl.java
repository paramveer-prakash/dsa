package com.param.designpattern.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book ISBN: " + book.getIsbn() + " cost: " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost: " + cost);
        return cost;
    }
}