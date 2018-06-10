
CREATE TABLE AD (
    ID serial,
    TEXT varchar(255),
    URL_CLICK varchar(255) NOT NULL,
    USER_ID bigint
);

CREATE TABLE EFFECT (
    ID serial,
    EFFECT_NAME varchar(100) NOT NULL
);

CREATE TABLE AD_EFFECTS (
    ID serial,
    AD_ID bigint NOT NULL,
    EFFECT_ID bigint NOT NULL
);