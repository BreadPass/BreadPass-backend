package com.breadpass.infrastructure.exception.object.domain;

import com.breadpass.infrastructure.exception.object.general.GeneralException;
import com.breadpass.infrastructure.exception.payload.code.BaseCode;

public class MemberHandler extends GeneralException {
    public MemberHandler(BaseCode code){
        super(code);
    }
}
