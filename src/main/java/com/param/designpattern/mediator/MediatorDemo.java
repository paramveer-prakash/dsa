package com.param.designpattern.mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoom();
        User alic = new User("Alic",chatRoom);
        User bob = new User("Bob",chatRoom);

        alic.send("Hi Bob!");
        bob.send("Hey Alic: How are you");
    }
}
