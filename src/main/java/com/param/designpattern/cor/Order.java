package com.param.designpattern.cor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String userId;
    private String paymentMethod;
    private String shippingAddress;
    private String itemId;
    private int quantity;


}
