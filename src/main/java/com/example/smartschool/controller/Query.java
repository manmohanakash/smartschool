package com.example.smartschool.controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.smartschool.domain.Student;
import com.example.smartschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class Query implements GraphQLQueryResolver {

    @Autowired
    StudentService studentService;

    public Student getStudent(int id) {
        return studentService.getStudent(id);
    }
}