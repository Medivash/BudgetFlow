package com.budgetflow.controller;

import com.budgetflow.dto.*;
import com.budgetflow.entity.CategoriesEntity;
import com.budgetflow.service.CategoryService;
import com.budgetflow.service.ExpensesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/category")
@RestController
@Tag(name = "CategoryController", description = "api controller предназначенный для CRUD категорий")

public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/list")
    public List<CategoriesEntity> getCategory() {
        return categoryService.getCategory();
    }

    @PostMapping("/add")
    public void addCategory(@RequestBody AddCategoryDto dto){
        categoryService.addCategory(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable long id) { categoryService.deleteCategory(id); }

    @PutMapping("/edit")
    public void editCategory(@RequestBody EditCategoryDto dto) { categoryService.editCategory(dto); }
}
