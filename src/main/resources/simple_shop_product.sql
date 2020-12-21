create table product
(
    id           int auto_increment
        primary key,
    name         varchar(50) charset utf8 default '0'  not null,
    price        decimal(10, 2)           default 0.00 not null,
    origin_price decimal(10, 2)           default 0.00 not null,
    create_time  datetime                              null,
    update_time  datetime                              null,
    status       tinyint                  default 0    not null,
    is_del       tinyint                  default 0    not null,
    cat_id       int                                   null,
    pic          varchar(200)                          null,
    text         varchar(10000)                        null,
    stock        int                                   null,
    sole_number  int                                   null,
    props        varchar(1000)                         null,
    tags         varchar(200)                          null
)
    charset = latin1;

