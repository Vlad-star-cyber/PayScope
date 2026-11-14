package com.example.pay_scope.entities;

import com.example.pay_scope.entities.enums.RatingCategory;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("client_ratings")
public record ClientRating(
        @Id
        ObjectId id,
        ObjectId clientId,
        int score,
        RatingCategory category,
        Instant calculatedAt,
        Integer paidInvoicesCount,
        Integer delayedInvoicesCount,
        Double avgDelayDays,
        String strategy) {
}
