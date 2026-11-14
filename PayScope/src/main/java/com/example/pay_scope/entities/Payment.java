package com.example.pay_scope.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Document("payments")
public record Payment(
        @Id
        ObjectId id,
        ObjectId invoiceId,
        ObjectId clientId,
        String bankOperationNumber,
        @Field(targetType = FieldType.DECIMAL128)
        BigDecimal amount,
        LocalDate paymentDate,
        ObjectId createdBy,
        Instant createdAt) {
}

