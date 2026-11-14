package com.example.pay_scope.entities;

import com.example.pay_scope.entities.enums.InvoiceStatus;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document("invoices")
@Getter
@Setter
public class Invoice {

    @Id
    private ObjectId id;
    private ObjectId dealId;
    private ObjectId clientId;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal amount;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal paidAmount;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal balance;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private InvoiceStatus status;
    private LocalDate paidDate;
    private Integer delayDays;
}
