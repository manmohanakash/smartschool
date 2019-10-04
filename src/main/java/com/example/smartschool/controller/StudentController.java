package com.example.smartschool.controller;

import com.example.smartschool.domain.Student;
import com.example.smartschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }
}
