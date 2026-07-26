CREATE TABLE batch
(
    id              BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    unique_code     VARCHAR(100) UNIQUE NOT NULL,
    product_id      BIGINT              NOT NULL REFERENCES product (id),
    quantity        INT                 NOT NULL,
    expiration_date DATE                NOT NULL,
    entry_date      DATE                NOT NULL,
    cost_price      DECIMAL(12, 2)      NOT NULL
);