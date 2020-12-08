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
)
    charset = latin1;

