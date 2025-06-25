package com.breadpass.domain.common;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Embeddable
public class PlaceInfo {

    private String name;

    @Lob
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    private String detailAddress;
    private String phoneNumber;

    private String imageUrl;

    private Double latitude;
    private Double longitude;

    private String googlePlaceId;

}
