package com.example.noteplaner.repository;

import com.example.noteplaner.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
