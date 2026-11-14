package com.example.pay_scope.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    ADMIN("Администратор системы"),
    CLIENT("Клиент");

    private final String field;

    public String authority() { return "ROLE_" + name(); }
}
