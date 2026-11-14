package com.example.pay_scope.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InvoiceStatus {
    UNPAID("Не оплачен"),
    PARTIALLY_PAID("Частично оплачен"),
    OVERDUE("Просрочен"),
    PAID("Оплачен");

    private final String field;
}
