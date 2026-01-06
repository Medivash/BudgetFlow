package com.budgetflow.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddExpensesDto {

    @NotNull
    private long expenses;

    @NotNull
    private String category;
}
