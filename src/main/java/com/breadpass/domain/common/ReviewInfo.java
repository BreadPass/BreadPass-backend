package com.breadpass.domain.common;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Embeddable
public class ReviewInfo {
    private Double rating = 0.0;
    private Integer reviewCount = 0;
}
