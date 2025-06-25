package com.breadpass.domain.common;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Embeddable
public class PlaceInfo {

    private String name;
    private String detailAddress;
    private String phoneNumber;

    private String imageUrl;

    private Double latitude;
    private Double longitude;

    private String googlePlaceId;

}
