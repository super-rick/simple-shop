create table address
(
    id          int auto_increment primary key,
    user_id     int          null,
    address     varchar(100) null,
    phone       varchar(50)  null,
    name        varchar(50)  null,
    create_time datetime     null,
    update_time datetime     null,
    status      tinyint      null,
    is_del      tinyint      null
);


create table admin
(
    id          int auto_increment primary key,
    username    varchar(50) null,
    password    varchar(50) null,
    phone       varchar(50) null,
    create_time datetime    null,
    update_time datetime    null,
    role_id     int         null,
    status      tinyint     null,
    is_del      tinyint     null
);

create table cart
(
    id           int auto_increment primary key,
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

create table deliver
(
    id            int auto_increment
        primary key,
    order_id      int         null,
    order_item_id int         null,
    order_number  int         null,
    user_id       int         null,
    address_id    int         null,
    address       int         null,
    phone         varchar(50) null,
    name          varchar(50) null,
    deliver_code  varchar(50) null,
    type          tinyint     null,
    status        tinyint     null,
    is_del        tinyint     null
);

create table message
(
    id          int auto_increment
        primary key,
    user_id     int           null,
    title       varchar(200)  null,
    content     varchar(1000) null,
    create_time datetime      null,
    type        tinyint       null,
    status      tinyint       null
);

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

create table role
(
    id          int auto_increment
        primary key,
    name        varchar(50) null,
    create_time datetime    null,
    update_time datetime    null,
    status      tinyint     null,
    is_del      tinyint     null
);

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
);

create table user
(
    id          int auto_increment
        primary key,
    username    varchar(50) null,
    password    varchar(50) null,
    phone       varchar(50) null,
    status      tinyint     null,
    is_del      tinyint     null,
    create_time datetime    null,
    update_time datetime    null,
    login_time  datetime    null
);

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

create table permission
(
    id          int auto_increment
        primary key,
    menu_name   varchar(50)  null,
    perm_name   varchar(50)  null,
    url         varchar(200) null,
    type        tinyint      null,
    pid         int          null,
    level       int          null,
    create_time datetime     null,
    update_time datetime     null,
    status      tinyint      null,
    is_del      tinyint      null,
    sort        int          null
);

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
);

create table category
(
    id          int auto_increment
        primary key,
    name        varchar(50) null,
    pid         int         null,
    level       int         null,
    create_time datetime    null,
    update_time datetime    null,
    status      tinyint     null,
    is_del      tinyint     null,
    sort        int         null
);

create table `order`
(
    id            int auto_increment
        primary key,
    order_number  varchar(50)                            null,
    user_id       int                                    not null,
    create_time   datetime                               not null,
    update_time   datetime                               not null,
    pay_time      datetime                               not null,
    cancel_time   datetime                               not null,
    deliver_time  datetime                               not null,
    finish_time   datetime                               not null,
    total_price   decimal(10, 2)            default 0.00 not null,
    pay_price     decimal(10, 2)            default 0.00 not null,
    deliver_price decimal(10, 2)            default 0.00 not null,
    address       varchar(200) charset utf8 default '0'  not null,
    phone         varchar(50) charset utf8  default '0'  not null,
    name          varchar(50) charset utf8  default '0'  not null,
    pic           varchar(200) charset utf8 default '0'  not null,
    status        tinyint                   default 0    not null,
    is_del        tinyint                   default 0    not null
);

