package com.budgetflow.entity;

import com.budgetflow.enums.Category;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "expenses")
public class ExpensesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expenses_seq")
    @SequenceGenerator(name = "expenses_seq", sequenceName = "expenses_seq", allocationSize = 1)
    private long id;

    @Enumerated(EnumType.STRING)
    private Category category;

    private long expenses;

    @CreationTimestamp
    @Column(name = "expenses_date", nullable = false)
    private LocalDateTime expensesDate;
}
