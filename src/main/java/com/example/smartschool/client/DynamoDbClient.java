package com.example.smartschool.client;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDbClient {

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
            .withRegion(Regions.US_EAST_1)
            .build();

    return client;
    }

}
