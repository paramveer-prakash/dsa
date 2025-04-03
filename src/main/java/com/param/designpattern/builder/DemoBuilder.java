package com.param.designpattern.builder;

import java.math.BigDecimal;

public class DemoBuilder {

    public static void main(String[] args) {
        Product product = Product.builder()
                .name("myProduct")
                .price(BigDecimal.valueOf(99))
                .build();

        System.out.println(product.getName()+" "+product.getPrice());
    }
}
