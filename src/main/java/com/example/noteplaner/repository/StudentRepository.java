package com.example.noteplaner.repository;

import com.example.noteplaner.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
