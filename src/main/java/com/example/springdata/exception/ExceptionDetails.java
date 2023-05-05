package com.example.springdata.exception;

import java.time.LocalDateTime;

public record ExceptionDetails(
        LocalDateTime timeStamp,
        String message,
        String details
) {
}
