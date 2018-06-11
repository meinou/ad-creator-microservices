
CREATE TABLE AD (
    AID serial,
    cta varchar(255),
    Image_Url varchar(1024) NOT NULL,
    Click_Url varchar(1024) NOT NULL,
    USER_ID bigint
);

CREATE TABLE EFFECT (
    EID serial,
    Name varchar(100) NOT NULL
);

CREATE TABLE AD_EFFECTS (
    AD_AID bigint NOT NULL,
    EFFECTS_EID bigint NOT NULL
);