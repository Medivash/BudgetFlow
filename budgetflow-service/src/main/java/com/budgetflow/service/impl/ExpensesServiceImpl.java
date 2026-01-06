package com.budgetflow.service.impl;

import com.budgetflow.dto.*;
import com.budgetflow.entity.CategoriesEntity;
import com.budgetflow.entity.ExpensesEntity;
import com.budgetflow.repository.CategoryRepository;
import com.budgetflow.repository.ExpensesRepository;
import com.budgetflow.service.ExpensesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ExpensesServiceImpl implements ExpensesService {

    private final ExpensesRepository expensesRepository;
    private final CategoryRepository categoryRepository;


    @Override
    public void addExpenses(AddExpensesDto dto) {
        CategoriesEntity categoriesEntity = categoryRepository.findByCategory(dto.getCategory());
        ExpensesEntity entity = ExpensesEntity
                .builder()
                .category(categoriesEntity)
                .expenses(dto.getExpenses())
                .build();
        expensesRepository.save(entity);
    }

    @Override
    public GetExpensesDto getExpenses(long id) {
        ExpensesEntity expensesEntity = expensesRepository.findById(id).orElseThrow();
        return GetExpensesDto
                .builder()
                .category(expensesEntity.getCategory().getCategory())
                .expenses(expensesEntity.getExpenses())
                .date(expensesEntity.getExpensesDate())
                .build();
    }

    @Override
    public List<ExpensesEntity> listExpenses(ListExpensesDto dto) {
        CategoriesEntity categoriesEntity = categoryRepository.findByCategory(dto.getCategory());
        return expensesRepository.findAllByCategoryId(categoriesEntity.getId());
    }

    @Override
    public void deleteExpenses(long id) {
        if (expensesRepository.existsById(id)) {
            expensesRepository.deleteById(id);
        }
    }

    @Override
    public void editExpenses(EditExpensesDto dto) {
        CategoriesEntity categoriesEntity = categoryRepository.findByCategory(dto.getCategory());
        ExpensesEntity entity = expensesRepository.findById(dto.getId()).orElseThrow();
        entity.setExpenses(dto.getExpenses());
        entity.setCategory(categoriesEntity);
        expensesRepository.save(entity);
    }

    @Override
    public List<CategoriesEntity> getCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void addCategory(AddCategoryDto dto) {
        CategoriesEntity categoriesEntity = CategoriesEntity
                .builder()
                .category(dto.getCategory())
                .build();
        categoryRepository.save(categoriesEntity);
    }
}