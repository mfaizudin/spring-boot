package com.example.assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assessment.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    
}
