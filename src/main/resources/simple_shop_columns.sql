create table columns
(
    id          int auto_increment
        primary key,
    name        varchar(50)  null,
    url         varchar(200) null,
    type        tinyint      null,
    sort        int          null,
    positions   int          null,
    product_id  int          null,
    status      tinyint      null,
    create_time datetime     null,
    update_time datetime     null
);

