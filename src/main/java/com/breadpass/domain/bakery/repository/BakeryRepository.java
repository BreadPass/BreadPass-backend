package com.breadpass.domain.bakery.repository;

import com.breadpass.domain.bakery.entity.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BakeryRepository extends JpaRepository<Bakery, Long> {
}
