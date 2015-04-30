package com.shinetechchina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shinetechchina.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
