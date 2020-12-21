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

