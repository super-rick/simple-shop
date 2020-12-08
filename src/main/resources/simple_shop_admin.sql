create table admin
(
    id          int auto_increment
        primary key,
    username    varchar(50) null,
    password    varchar(50) null,
    phone       varchar(50) null,
    create_time datetime    null,
    update_time datetime    null,
    role_id     int         null,
    status      tinyint     null,
    is_del      tinyint     null
)
    charset = latin1;

