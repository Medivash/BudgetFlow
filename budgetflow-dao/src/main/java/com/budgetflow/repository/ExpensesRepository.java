package com.budgetflow.repository;

import com.budgetflow.entity.ExpensesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpensesRepository extends JpaRepository <ExpensesEntity, Long> {

    List<ExpensesEntity> findAllByCategoryId(long id);
}
