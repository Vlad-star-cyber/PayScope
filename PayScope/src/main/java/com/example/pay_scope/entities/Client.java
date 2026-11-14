package com.example.pay_scope.entities;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("clients")
@Getter
@Setter
public class Client {

    @Id
    private ObjectId id;
    private String name;
    private String unp;
    private String contactPerson;
    private String phone;
    private String email;
    private String address;
    private Instant createdAt;
}
