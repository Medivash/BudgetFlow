package com.budgetflow.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ListExpensesDto {

    private LocalDateTime firstDate;

    private LocalDateTime secoundDate;

    private String category;

}
