package com.example.Data_streams_Working_with_files.service;

import com.example.Data_streams_Working_with_files.model.Faculty;
import com.example.Data_streams_Working_with_files.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FacultService {
    private final FacultyRepository facultyRepository;

    public FacultService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAllFaculty() {
        return facultyRepository.findAll();
    }

    public Collection<Faculty> findByNameIgnoreCase(String name) {
        return facultyRepository.findByNameIgnoreCase(name);
    }

    public Collection<Faculty> findByColorIgnoreCase(String color) {
        return facultyRepository.findByColorIgnoreCase(color);
    }

}
