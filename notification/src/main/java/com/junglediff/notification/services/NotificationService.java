package com.junglediff.notification.services;

import com.junglediff.notification.NotificationRequest;


public interface NotificationService {

    void send(NotificationRequest notificationRequest);

}
