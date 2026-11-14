package com.example.pay_scope.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentMethod {
    PREPAYMENT("Предоплата"),
    ON_DELIVERY("Оплата по факту"),
    INSTALLMENTS("Оплата частями");

    private final String field;
}
