package com.junglediff.notification.services;

import com.junglediff.notification.NotificationRequest;
import com.junglediff.notification.entities.Notification;
import com.junglediff.notification.repositories.NotificationRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;

@Service
public class NotificationServiceImp implements NotificationService{

    private final NotificationRepository notificationRepository;

    public NotificationServiceImp(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toArticleTitle(notificationRequest.toArticleTitle())
                        .sender("Junglediff")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
