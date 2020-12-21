create table cart
(
    id           int auto_increment
        primary key,
    user_id      int            null,
    sku_id       int            null,
    sku_name     varchar(50)    null,
    product_id   int            null,
    product_name varchar(50)    null,
    price        decimal(10, 2) null,
    quantity     int            null,
    create_time  datetime       null,
    update_time  datetime       null,
    status       tinyint        null,
    is_del       tinyint        null
);

