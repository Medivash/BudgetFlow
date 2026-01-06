package com.budgetflow.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class ListExpensesDto {

    @NotBlank
    private String category;

}
