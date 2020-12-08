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
)
    charset = latin1;

