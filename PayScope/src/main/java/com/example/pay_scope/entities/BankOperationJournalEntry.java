package com.example.pay_scope.entities;

import com.example.pay_scope.entities.enums.BankResult;
import com.example.pay_scope.entities.enums.JournalReason;
import lombok.Getter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Document("bank_operation_journal")
public record BankOperationJournalEntry(
        @Id ObjectId id,
        Instant createdAt,
        ObjectId userId,
        ObjectId clientId,
        ObjectId invoiceId,
        String bankOperationNumber,
        @Field(targetType = FieldType.DECIMAL128) BigDecimal amount,
        LocalDate paymentDate,
        BankResult bankResult,
        JournalReason reason,
        String reasonText) {
}
