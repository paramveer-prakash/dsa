package com.param.designpattern.builder;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;


    private Product(ProductBuilder builder){
        this.name = builder.name;
        this.price = builder.price;
    }

    public String getName(){
        return name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    static class ProductBuilder{
        private String name;
        private BigDecimal price;

        ProductBuilder(){

        }

        ProductBuilder name(String name){
            this.name = name;
            return this;
        }

        ProductBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }

        Product build(){
            return new Product(this);
        }
    }
}
