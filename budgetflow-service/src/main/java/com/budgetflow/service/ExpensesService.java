package com.budgetflow.service;

import com.budgetflow.dto.AddExpensesDto;
import com.budgetflow.dto.EditExpensesDto;
import com.budgetflow.dto.GetExpensesDto;
import com.budgetflow.dto.ListExpensesDto;
import com.budgetflow.entity.CategoriesEntity;
import com.budgetflow.entity.ExpensesEntity;

import java.util.List;

public interface ExpensesService {

    void addExpenses(AddExpensesDto dto);

    GetExpensesDto getExpenses(long id);

    List<ExpensesEntity> listExpenses(ListExpensesDto dto);

    void deleteExpenses(long id);

    void editExpenses(EditExpensesDto dto);

    List<CategoriesEntity> getCategory();

}
