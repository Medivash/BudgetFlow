package com.budgetflow.service;

import com.budgetflow.dto.*;
import com.budgetflow.entity.CategoriesEntity;

import java.util.List;

public interface CategoryService {

    List<CategoriesEntity> getCategory();

    void addCategory(AddCategoryDto dto);

    void deleteCategory(long id);

    void editCategory(EditCategoryDto dto);
}
