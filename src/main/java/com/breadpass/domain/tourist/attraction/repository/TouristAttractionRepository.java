package com.breadpass.domain.tourist.attraction.repository;

import com.breadpass.domain.tourist.attraction.entity.TouristAttraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristAttractionRepository extends JpaRepository<TouristAttraction, Long> {
}
