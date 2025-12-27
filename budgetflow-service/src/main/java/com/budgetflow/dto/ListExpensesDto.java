package com.budgetflow.dto;

import com.budgetflow.enums.Category;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class ListExpensesDto {

    @NotNull
    private Category category;

}
