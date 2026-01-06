alter table expenses add column expenses_date timestamp;

comment on column expenses.expenses_date is 'Дата расхода';