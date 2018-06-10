create table USERS (
    ID serial,
    IS_ADMIN boolean default false,
    USER_NAME varchar(100) NOT NULL,
    EMAIL varchar(100) NOT NULL,
    PASSWORD varchar(100) NOT NULL
);