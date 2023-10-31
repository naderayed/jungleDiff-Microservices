package com.junglediff.notification;

public record NotificationRequest(
        Integer toArticleId,
        String toArticleTitle,
        String message
) {}


