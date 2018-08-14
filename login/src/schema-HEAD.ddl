-- noinspection SqlNoDataSourceInspectionForFile


    create table Admin (
        id bigint not null,
        name varchar(255) not null,
        password varchar(255) not null,
        username varchar(255) not null,
        primary key (id)
    );
