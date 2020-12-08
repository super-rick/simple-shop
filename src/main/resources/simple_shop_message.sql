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

