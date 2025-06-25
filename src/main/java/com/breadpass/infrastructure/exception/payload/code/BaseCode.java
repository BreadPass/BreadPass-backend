package com.breadpass.infrastructure.exception.payload.code;

public interface BaseCode {
    Reason getReason();
    Reason getReasonHttpStatus();
}
