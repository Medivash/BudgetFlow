package com.budgetflow.controller;

import com.budgetflow.dto.*;
import com.budgetflow.entity.CategoriesEntity;
import com.budgetflow.entity.ExpensesEntity;
import com.budgetflow.service.ExpensesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/expenses")
@RestController
@Tag(name = "ExpensesController", description = "api controller предназначенный для внесения расходов")
public class ExpensesController {

    private final ExpensesService expensesService;

    @PostMapping("/add")
    public void addExpenses(@RequestBody AddExpensesDto dto) {
        expensesService.addExpenses(dto);
    }

    @GetMapping("get/{id}")
    public GetExpensesDto getExpenses(@PathVariable long id) {
        return expensesService.getExpenses(id);
    }

    @PostMapping("/list")
    public List<ExpensesEntity> listExpenses(@RequestBody ListExpensesDto dto) {
        return expensesService.listExpenses(dto);
    }

    @PutMapping("/edit")
    public void editExpenses(@RequestBody EditExpensesDto dto) {
        expensesService.editExpenses(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExpenses(@PathVariable long id) {
        expensesService.deleteExpenses(id);
    }
}
