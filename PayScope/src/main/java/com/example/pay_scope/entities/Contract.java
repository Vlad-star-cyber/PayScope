package com.example.pay_scope.entities;

import com.example.pay_scope.entities.enums.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("contracts")
@Setter
@Getter
public class Contract {

    @Id
    private ObjectId id;
    private ObjectId clientId;
    private String number;
    private LocalDate date;
    private PaymentMethod paymentMethod;
}