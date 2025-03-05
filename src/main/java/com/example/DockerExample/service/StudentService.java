package com.example.DockerExample.service;

import com.example.DockerExample.model.Student;
import com.example.DockerExample.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    public final StudentRepo repo;

    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getStudents(){
        return repo.findAll();

    }
    public void addStudent(Student student){
        repo.save(student);
    }
}
