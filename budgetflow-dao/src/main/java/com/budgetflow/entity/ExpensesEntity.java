package com.budgetflow.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "expenses")
public class ExpensesEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expenses_seq")
    @SequenceGenerator(name = "expenses_seq", sequenceName = "expenses_seq", allocationSize = 1)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private CategoriesEntity category;

    private long expenses;

    @CreationTimestamp
    @Column(name = "expenses_date", nullable = false)
    private LocalDateTime expensesDate;
}
