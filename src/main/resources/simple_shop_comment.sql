create table comment
(
    id           int auto_increment
        primary key,
    user_id      int           null,
    title        varchar(100)  null,
    content      varchar(1000) null,
    pic          varchar(1000) null,
    create_time  datetime      null,
    update_time  datetime      null,
    product_id   int           null,
    product_name varchar(50)   null,
    sku_id       int           null,
    sku_name     varchar(50)   null,
    buy_quantity int           null,
    buy_time     datetime      null,
    status       tinyint       null,
    is_del       tinyint       null
);

