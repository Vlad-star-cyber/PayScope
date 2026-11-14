package com.example.pay_scope.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RatingCategory {
    HIGH("Высокий"),
    MEDIUM("Средний"),
    LOW("Низкий");

    private final String field;
}
