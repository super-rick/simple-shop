create table address
(
    id          int auto_increment
        primary key,
    user_id     int          null,
    address     varchar(100) null,
    phone       varchar(50)  null,
    name        varchar(50)  null,
    create_time datetime     null,
    update_time datetime     null,
    status      tinyint      null,
    is_del      tinyint      null
);

INSERT INTO simple_shop.address (id, user_id, address, phone, name, create_time, update_time, status, is_del) VALUES (1, null, '4444', '123123', 'rick', null, null, null, null);