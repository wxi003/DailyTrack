package com.example.dailytrack.repository;

import com.example.dailytrack.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiwang
 */

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
