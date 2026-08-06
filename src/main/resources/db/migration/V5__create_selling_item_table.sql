CREATE TABLE selling_item
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    selling_id UUID           NOT NULL REFERENCES selling (id),
    product_id BIGINT         NOT NULL REFERENCES product (id),
    quantity   INT            NOT NULL,
    unit_price DECIMAL(12, 2) NOT NULL
);