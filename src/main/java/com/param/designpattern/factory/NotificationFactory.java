package com.param.designpattern.factory;

public class NotificationFactory {
    public static Notification createNotification(NotificationType type){
        if(NotificationType.EMAIL.equals(type)){
            return new EmailNotification();
        }else if( NotificationType.SMS.equals(type)){
            return new SMSNotification();
        }
        return null;
    }
}
