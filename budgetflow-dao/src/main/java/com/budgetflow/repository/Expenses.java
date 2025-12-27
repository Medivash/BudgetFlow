package com.budgetflow.repository;

import com.budgetflow.entity.ExpensesEntity;
import com.budgetflow.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Expenses extends JpaRepository <ExpensesEntity, Long> {

    List<ExpensesEntity> findAllByCategory(Category category);

}
