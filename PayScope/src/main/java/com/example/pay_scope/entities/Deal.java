package com.example.pay_scope.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("deals")
public class Deal {

    @Id
    private ObjectId id;
    private ObjectId contractId;
    private LocalDate date;
    private String description;
}
