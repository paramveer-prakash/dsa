package com.param.designpattern.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("Calling display on image1:");
        image1.display();

        System.out.println("Calling display again on image1:");
        image1.display();

        System.out.println("Calling display on image2:");
        image2.display();
    }
}
