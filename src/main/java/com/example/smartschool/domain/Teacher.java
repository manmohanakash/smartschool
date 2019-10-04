package com.example.smartschool.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@DynamoDBTable(tableName="Student")
public class Teacher {

    @DynamoDBHashKey
    private int  id;


}
