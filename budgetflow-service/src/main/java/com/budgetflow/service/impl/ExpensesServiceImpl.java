package com.budgetflow.service.impl;

import com.budgetflow.dto.AddExpensesDto;
import com.budgetflow.dto.EditExpensesDto;
import com.budgetflow.dto.ListExpensesDto;
import com.budgetflow.entity.ExpensesEntity;
import com.budgetflow.enums.Category;
import com.budgetflow.repository.Expenses;
import com.budgetflow.service.ExpensesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ExpensesServiceImpl implements ExpensesService {

    private final Expenses repository;

    @Override
    public void addExpenses(AddExpensesDto dto) {
        ExpensesEntity entity = ExpensesEntity
                .builder()
                .category(dto.getCategory())
                .expenses(dto.getExpenses())
                .build();
        repository.save(entity);
    }

    @Override
    public ExpensesEntity getExpenses(long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<ExpensesEntity> listExpenses(ListExpensesDto dto) {
        return repository.findAllByCategory(dto.getCategory());
    }

    @Override
    public void deleteExpenses(long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }

    @Override
    public void editExpenses(EditExpensesDto dto) {
        ExpensesEntity entity = repository.findById(dto.getId()).orElseThrow();
        entity.setExpenses(dto.getExpenses());
        entity.setCategory(dto.getCategory());
        repository.save(entity);
    }

    @Override
    public List<String> getCategory() {
        return List.of(Category.DINNER.name(), Category.FRIDAY.name(), Category.GROCERIES.name());
    }
}
