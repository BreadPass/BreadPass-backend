package com.breadpass.domain.tourist.attraction.entity;

import com.breadpass.domain.auditing.entity.BaseTimeEntity;
import com.breadpass.domain.common.PlaceInfo;
import com.breadpass.domain.common.ReviewInfo;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLRestriction;

@Getter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SQLRestriction("deleted = false")
public class TouristAttraction extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private PlaceInfo placeInfo;

    @Embedded
    private ReviewInfo reviewInfo;

    @Builder.Default
    private Boolean deleted = false;


}
