create table order_item
(
    id            int auto_increment
        primary key,
    product_id    int            null,
    product_name  varchar(50)    null,
    sku_id        int            null,
    sku_name      varchar(50)    null,
    price         decimal        null,
    origin_price  decimal(10, 2) null,
    deliver_price decimal(10, 2) null,
    quantity      int            null,
    order_id      int            null
);

