package com.budgetflow.repository;

import com.budgetflow.entity.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <CategoriesEntity, Long> {

    CategoriesEntity findByCategory(String category);
}
