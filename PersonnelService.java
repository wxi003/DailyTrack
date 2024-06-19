package com.example.dailytrack.service;

import com.example.dailytrack.model.Personnel;
import com.example.dailytrack.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelService {
    @Autowired
    private PersonnelRepository personnelRepository;

    public List<Personnel> getAllPersonnel() {
        return personnelRepository.findAll();
    }

    public Personnel savePersonnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    public Personnel getPersonnelById(Long id) {
        return personnelRepository.findById(id).orElseThrow(() -> new RuntimeException("Personnel not found."));
    }
}