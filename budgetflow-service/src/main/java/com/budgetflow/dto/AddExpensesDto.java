package com.budgetflow.dto;

import com.budgetflow.enums.Category;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddExpensesDto {

    @NotNull
    private long expenses;

    @NotNull
    private Category category;

}
