package com.shinetechchina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shinetechchina.entity.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
