
DROP SCHEMA IF EXISTS MY_SCHEMA;
CREATE SCHEMA MY_SCHEMA;


CREATE TABLE MY_SCHEMA.ACCOUNT_TYPE
(
    ACCOUNT_TYPE_ID    BIGINT        NOT NULL,
    MNEMONIC            VARCHAR(100)  NOT NULL UNIQUE,
    ACCOUNT_TYPE_NAME   VARCHAR(255)  NOT NULL,
    CREATION_DATE       DATE          NOT NULL,
    PRIMARY KEY (ACCOUNT_TYPE_ID)
);

CREATE TABLE MY_SCHEMA.ACCOUNT_TX
(
    TX_ID               BIGINT       NOT NULL,
    ACCOUNT_TYPE_ID     BIGINT       NOT NULL,
    MEMBER_ID           BIGINT       NOT NULL,
    AMOUNT              BIGINT       NOT NULL,
    TX_DATE             DATE         NOT NULL,
    PRIMARY KEY (TX_ID),
    CONSTRAINT FK_ACCOUNT_TYPE_ID FOREIGN KEY (ACCOUNT_TYPE_ID) REFERENCES MY_SCHEMA.ACCOUNT_TYPE (ACCOUNT_TYPE_ID)
);

CREATE TABLE MY_SCHEMA.ACCOUNT_TX_DETAILS
(
    ACCOUNT_TX_DETAILS_ID  BIGINT       NOT NULL,
    TX_ID               BIGINT       NOT NULL,
    PARTNER_NAME        VARCHAR(255)        NOT NULL,
    NUMBER_OF_ITEMS     BIGINT       NOT NULL,
    AMOUNT              BIGINT       NOT NULL,
    TX_DATE             DATE         NOT NULL,
    PRIMARY KEY (ACCOUNT_TX_DETAILS_ID),
    CONSTRAINT FK_ACCOUNT_TX_ID FOREIGN KEY (TX_ID) REFERENCES MY_SCHEMA.ACCOUNT_TX (TX_ID)
);