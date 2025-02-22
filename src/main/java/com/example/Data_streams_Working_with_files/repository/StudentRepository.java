package com.example.Data_streams_Working_with_files.repository;

import com.example.Data_streams_Working_with_files.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByNameIgnoreCase(String name);

    Collection<Student> findStudentByNameContainsIgnoreCase(String name);

    Collection<Student> findAllByNameContainsIgnoreCase(String namePart);

    Collection<Student> findByAgeBetween(int minAge, int maxAge);



}
