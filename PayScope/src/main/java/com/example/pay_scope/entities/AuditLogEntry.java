package com.example.pay_scope.entities;

import com.example.pay_scope.entities.enums.AuditAction;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("audit_log")
public record AuditLogEntry(
        @Id
        ObjectId id,
        Instant timestamp,
        ObjectId userId,
        String login,
        AuditAction action,
        String entity,
        ObjectId entityId,
        String details) {
}

