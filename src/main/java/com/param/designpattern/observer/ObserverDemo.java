package com.param.designpattern.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Product laptop = new Product("Dell XPS 15",1500.00);

        User alice = new User("Alic");

        User bob = new User("Bob");

        laptop.subscribe(alice);
        laptop.subscribe(bob);

        System.out.println("Initial price change (no notification expected):");
        laptop.setPrice(1600.00);

        System.out.println("Price drop - Users should be notified");
        laptop.setPrice(1200.00);
    }
}
