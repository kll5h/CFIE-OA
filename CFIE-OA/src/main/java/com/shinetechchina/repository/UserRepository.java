package com.shinetechchina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shinetechchina.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
