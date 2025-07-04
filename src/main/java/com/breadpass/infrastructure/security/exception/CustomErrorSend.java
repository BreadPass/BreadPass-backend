package com.breadpass.infrastructure.security.exception;

import com.breadpass.infrastructure.exception.payload.code.ErrorStatus;
import com.breadpass.infrastructure.exception.payload.dto.ApiResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CustomErrorSend {
    public static void handleException(HttpServletResponse response, ErrorStatus errorStatus, String errorPoint) throws IOException {
        ApiResponseDto<Object> apiResponseEntity = ApiResponseDto.onFailure(errorStatus.getCode(), errorStatus.getMessage(), errorPoint);

        response.setStatus(errorStatus.getHttpStatus().value());
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new ObjectMapper().writeValueAsString(apiResponseEntity));
    }
}