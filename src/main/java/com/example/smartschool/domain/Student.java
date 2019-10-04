package com.example.smartschool.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter @Setter
@DynamoDBTable(tableName="Student")
public class Student {

    @DynamoDBHashKey
    private int  id;

    @DynamoDBAttribute
    private Date dateOfBirth;

    @DynamoDBAttribute
    private int height;

    @DynamoDBAttribute
    private int weight;

    @DynamoDBAttribute
    private String bloodGroup;

    @DynamoDBAttribute
    private String firstName;

    @DynamoDBAttribute
    private String middleName;

    @DynamoDBAttribute
    private String lastName;

    @DynamoDBAttribute
    private String fatherName;

    @DynamoDBAttribute
    private String motherName;

    @DynamoDBAttribute
    private String phoneNumber;
}
