package com.example.pay_scope.entities;

import com.example.pay_scope.entities.enums.Role;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("users")
@Getter
@Setter
public class User {

    @Id
    private ObjectId id;
    private String login;
    private String passwordHash;
    private Role role;
    private ObjectId clientId;
    private boolean isBlocked;
    private int failedAttempts;
    private Instant lockedUntil;
    private Instant lastLoginAt;
    private Instant createdAt;
}

