package com.example.dancestudentmanagementsystem.repository;

import com.example.dancestudentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
