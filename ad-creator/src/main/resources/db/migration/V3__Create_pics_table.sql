CREATE TABLE EFFECTS (
    ID serial,
    EFFECT_NAME varchar(100) NOT NULL
);

CREATE TABLE ADS (
    ID serial,
    TEXT varchar(255),
    URL_CLICK varchar(255) NOT NULL,
    USER_ID bigint
);

CREATE TABLE AD_TO_EFFECT (
    ID serial,
    AD_ID bigint NOT NULL,
    EFFECT_ID bigint NOT NULL
);