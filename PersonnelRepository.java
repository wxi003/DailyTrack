package com.example.dailytrack.repository;

import com.example.dailytrack.model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiwang
 */
@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
}
