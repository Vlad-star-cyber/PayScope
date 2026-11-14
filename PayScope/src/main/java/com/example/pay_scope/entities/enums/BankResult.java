package com.example.pay_scope.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BankResult {
    PROCESSED("Проведён"),
    REJECTED("Отклонён"),
    PENDING("В обработке");

    private final String field;
}
