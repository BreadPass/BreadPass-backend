package com.breadpass.infrastructure.exception.object.domain;

import com.breadpass.infrastructure.exception.object.general.GeneralException;
import com.breadpass.infrastructure.exception.payload.code.BaseCode;

public class S3Handler extends GeneralException {
    public S3Handler(BaseCode code) {
        super(code);
    }
}
