package com.budgetflow.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditCategoryDto {

    @NotNull
    private long id;

    @NotNull
    private String categoryName;

}