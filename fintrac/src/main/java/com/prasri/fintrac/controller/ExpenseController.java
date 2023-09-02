package com.prasri.fintrac.controller;

import com.prasri.fintrac.model.Expense;
import com.prasri.fintrac.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseRepository expenseRepository;

    @PostMapping("/expense")
    public Long addExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense).getId();
    }

    @GetMapping("/expense/{id}")
    public Expense getExpense(@PathVariable Long id) {
        return expenseRepository.findById(id).orElseThrow(() -> new RuntimeException("Something went wrong!!"));
    }
    @DeleteMapping("/expense/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseRepository.deleteById(id);
        return "Expense with id : " + id + " is deleted successfully!!!";
    }
    @GetMapping("/expense")
    public List<Expense> getAll() {
        return expenseRepository.findAll();
    }

}
