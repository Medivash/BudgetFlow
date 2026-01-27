package com.budgetflow.service.impl;

import com.budgetflow.dto.AddCategoryDto;
import com.budgetflow.dto.EditCategoryDto;
import com.budgetflow.entity.CategoriesEntity;
import com.budgetflow.repository.CategoryRepository;
import com.budgetflow.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

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

    @Override
    public void deleteCategory(long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
        }
    }

    @Override
    public void editCategory(EditCategoryDto dto) {
        CategoriesEntity categoriesEntity = categoryRepository.findById(dto.getId());
        categoriesEntity.setCategory(dto.getCategoryName());
        categoryRepository.save(categoriesEntity);
    }
}
