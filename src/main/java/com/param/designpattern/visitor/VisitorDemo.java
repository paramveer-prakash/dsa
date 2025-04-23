package com.param.designpattern.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(500, "1234"),
                new Book(700, "5678"),
                new Fruit(100, 2, "Banana"),
                new Fruit(60, 5, "Apple")
        };

        int total = calculcatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculcatePrice(ItemElement[] items){
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item:items){
            sum+=item.accept(visitor);
        }
        return sum;
    }
}
