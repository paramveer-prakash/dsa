package com.param.designpattern.mediator;

public class User {
    private String name;
    private ChatRoomMediator chatRoomMediator;

    public User(String name, ChatRoomMediator chatRoom){
        this.name = name;
        this.chatRoomMediator = chatRoom;
    }

    public String getName(){
        return this.name;
    }

    public void send(String message){
        chatRoomMediator.showMessage(this,message);
    }
}
