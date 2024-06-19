package com.example.dailytrack.controller;

import com.example.dailytrack.model.*;
import com.example.dailytrack.service.*;
import com.example.dailytrack.dto.WorkEntryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workentries")
public class WorkEntryController {
    @Autowired
    private WorkEntryService workEntryService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private PersonnelService personnelService;

    @GetMapping
    public List<WorkEntry> getAllWorkEntries() {
        return workEntryService.getAllWorkEntries();
    }

    @GetMapping("/{id}")
    public Optional<WorkEntry> getWorkEntryById(@PathVariable Long id) {
        return workEntryService.getWorkEntryById(id);
    }

    @PostMapping
    public WorkEntry createWorkEntry(@RequestBody WorkEntryDto workEntryDto) {
        Project project = projectService.getProjectById(workEntryDto.getProjectId());
        Personnel personnel = personnelService.getPersonnelById(workEntryDto.getPersonnelId());
        WorkEntry workEntry = new WorkEntry(workEntryDto.getDate(),personnel,project,workEntryDto.getHoursSpent());
        return workEntryService.saveWorkEntry(workEntry);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkEntry(@PathVariable Long id) {
        workEntryService.deleteWorkEntry(id);
    }
}
