package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.klef.jfsd.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Method to check student login with email and password
    @Query("SELECT s FROM Student s WHERE s.email = ?1 AND s.password = ?2")
    Student checkstudentlogin(String email, String password);

    // Method to find a student by email
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Student findByEmail(String email);
}
