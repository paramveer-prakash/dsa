package com.param.designpattern.factory;

public class DemoFactory {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification(NotificationType.EMAIL);
        notification.notifyUser();

        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS);
        smsNotification.notifyUser();
    }
}
