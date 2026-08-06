CREATE TABLE selling
(
    id        UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    date      DATE         NOT NULL,
    client_id UUID REFERENCES client (id),
    payment   VARCHAR(100) NOT NULL,
    status    VARCHAR(100) NOT NULL
);