package com.example.student.repository;


import com.example.student.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface stuRepository extends JpaRepository<student, Integer> {

}