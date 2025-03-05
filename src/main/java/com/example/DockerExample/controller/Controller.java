package com.example.DockerExample.controller;

import com.example.DockerExample.model.Student;
import com.example.DockerExample.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {
    private final StudentService service;

    public Controller(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Student> getStudents(){
        return service.getStudents();

    }
    @PostMapping("/")
    //@RequestMapping("/")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
}
