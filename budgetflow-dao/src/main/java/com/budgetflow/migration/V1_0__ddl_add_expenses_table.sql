create table expenses
(
    id       bigint       not null,
    category varchar(255) not null,
    expenses bigint       not null,

    CONSTRAINT expenses_pk PRIMARY KEY (id)
);

CREATE SEQUENCE expenses_seq start 1;

comment on table expenses is 'qwe';
comment on column expenses.id is 'id';
-- todo desc