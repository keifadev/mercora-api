CREATE TABLE product
(
    id            BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    sku           VARCHAR(100) UNIQUE NOT NULL,
    name          VARCHAR(100)        NOT NULL,
    category      VARCHAR(100)        NOT NULL,
    selling_price DECIMAL(12, 2)      NOT NULL,
    minimum_stock INT                 NOT NULL
);