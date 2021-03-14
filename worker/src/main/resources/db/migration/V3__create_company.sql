CREATE TABLE andress (
    id uuid DEFAULT uuid_generate_v4 (),
    name VARCHAR NOT NULL,
    number int not null,
    complement varchar,
    PRIMARY KEY (id)
);

CREATE TABLE orders (
    id uuid DEFAULT uuid_generate_v4 (),
    name VARCHAR NOT NULL,
    andress_id uuid NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT andress_fk
        FOREIGN KEY(andress_id)
            REFERENCES andress(id)
);