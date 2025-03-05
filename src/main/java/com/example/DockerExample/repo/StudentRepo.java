package com.example.DockerExample.repo;

import com.example.DockerExample.model.Student;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
