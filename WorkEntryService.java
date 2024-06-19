package com.example.dailytrack.service;


import com.example.dailytrack.model.WorkEntry;
import com.example.dailytrack.repository.WorkEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @param
 * @author xiwang
 * @return
 */
@Service
public class WorkEntryService {
    @Autowired
    private WorkEntryRepository workEntryRepository;

    public List<WorkEntry> getAllWorkEntries() {
        return workEntryRepository.findAll();
    }

    public Optional<WorkEntry> getWorkEntryById(Long id) {
        return workEntryRepository.findById(id);
    }

    public WorkEntry saveWorkEntry(WorkEntry workEntry) {
        return workEntryRepository.save(workEntry);
    }

    public void deleteWorkEntry(Long id) {
        workEntryRepository.deleteById(id);
    }
}
