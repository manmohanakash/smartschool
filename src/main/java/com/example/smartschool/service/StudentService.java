package com.example.smartschool.service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.smartschool.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    AmazonDynamoDB amazonDynamoDB;

    public Student getStudent(int id){
        DynamoDBMapper mapper =  new DynamoDBMapper(amazonDynamoDB);
        return mapper.load(Student.class,id);
    }

    public Student saveStudent(Student student){
        DynamoDBMapper mapper =  new DynamoDBMapper(amazonDynamoDB);
        mapper.save(student);

        return mapper.load(Student.class,student.getId());
    }

}
