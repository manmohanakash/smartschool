package com.example.smartschool.controller;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.smartschool.domain.Student;
import com.example.smartschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class Mutation  implements GraphQLMutationResolver {

    @Autowired
    StudentService studentService;

    public Student saveStudent(Student student) {
        return studentService.saveStudent(student);
    }

}
