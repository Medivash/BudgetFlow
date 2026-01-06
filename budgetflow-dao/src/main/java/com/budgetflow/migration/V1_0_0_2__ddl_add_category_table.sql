create table categories
(
    id       bigint       not null,
    category varchar(255) not null,

    CONSTRAINT categories_pk PRIMARY KEY (id)
);

CREATE SEQUENCE categories_seq start 1;

comment on table categories is 'Таблица категорий расходов';
comment on column categories.id is 'id';
comment on column categories.category is 'Категория расхода';