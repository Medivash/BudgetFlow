package com.budgetflow.dto;
import com.budgetflow.enums.Category;
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
    private Category category;

    @NotNull
    private long planedExpens;
}
