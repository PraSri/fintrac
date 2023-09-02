package com.prasri.fintrac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @PostMapping("/expense")
    public Long addExpense() {
        return 1L;
    }

    @GetMapping("/expense/{id}")
    public Long getExpense() {
        return 1L;
    }

}
