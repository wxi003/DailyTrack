package com.example.dailytrack.repository;


import com.example.dailytrack.model.WorkEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @param
 * @author xiwang
 * @return
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called workEntryRepository

public interface WorkEntryRepository extends JpaRepository<WorkEntry, Long> {

}