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

