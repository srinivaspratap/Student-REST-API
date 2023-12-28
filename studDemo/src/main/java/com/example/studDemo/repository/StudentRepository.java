package com.example.studDemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studDemo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFeesPaid(boolean feesPaid);
    List<Student> findByName(String name);
}
