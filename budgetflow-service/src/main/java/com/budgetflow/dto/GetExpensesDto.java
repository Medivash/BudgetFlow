package com.budgetflow.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class GetExpensesDto {

    @NotNull
    private long expenses;

    @NotNull
    private String category;

    @NotNull
    private LocalDateTime date;
}
