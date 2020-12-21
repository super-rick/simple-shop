create table sku
(
    id           int auto_increment
        primary key,
    name         int            default 0    not null,
    props        varchar(50)    default '0'  not null,
    product_id   int            default 0    not null,
    product_name varchar(50)    default '0'  not null,
    create_time  datetime                    null,
    update_time  datetime                    null,
    status       tinyint        default 0    not null,
    is_del       tinyint        default 0    not null,
    stock        int            default 0    null,
    price        decimal(10, 2) default 0.00 not null,
    pic          varchar(200)                null,
    sole_number  int                         null
)
    charset = latin1;

