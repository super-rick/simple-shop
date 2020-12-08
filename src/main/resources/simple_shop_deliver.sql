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

