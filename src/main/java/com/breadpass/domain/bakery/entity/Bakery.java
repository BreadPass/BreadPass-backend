package com.breadpass.domain.bakery.entity;

import com.breadpass.domain.auditing.entity.BaseTimeEntity;
import com.breadpass.domain.common.PlaceInfo;
import com.breadpass.domain.common.ReviewInfo;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bakery extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private PlaceInfo placeInfo;

    @Embedded
    private ReviewInfo reviewInfo;

    @Builder.Default
    private Boolean deleted = false;

    //business logic
    public static Bakery createBakery(PlaceInfo placeInfo, ReviewInfo reviewInfo) {
        return Bakery.builder()
                .placeInfo(placeInfo)
                .reviewInfo(reviewInfo)
                .build();
    }

    public void delete() {
        if (deleted) {
            throw new IllegalStateException("Bakery is already deleted.");
        }
        this.deleted = true;
    }
}
