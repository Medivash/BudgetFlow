package com.budgetflow.dto;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class PlanExpensesDto {

    @NotNull
    private long id;

    @NotNull
    private LocalDate dateStart;

    @NotNull
    private LocalDate dateFinish;

    @NotNull
    private String category;

    @NotNull
    private long planedExpens;
}
