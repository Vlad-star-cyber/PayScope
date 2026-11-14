package com.example.pay_scope.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum JournalReason {
    BANK_REJECTED("Отклонена банком"),
    BANK_PENDING("Находится в обработке"),
    VALIDATION_FAILED("Не прошла проверку"),
    DUPLICATE("Повторяет внесённую ранее");

    private final String field;
}
