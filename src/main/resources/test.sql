create table if not exists t_config
(
    config_id bigint not null,
    config_name varchar(255) null,
    config_status varchar(8) null
    );

create table if not exists t_order0
(
    order_id bigint not null,
    order_name varchar(255) null,
    order_status varchar(8) null,
    order_time timestamp default CURRENT_TIMESTAMP null,
    user_id int null
    );

create table if not exists t_order1
(
    order_id bigint not null,
    order_name varchar(255) null,
    order_status varchar(8) null,
    order_time timestamp default CURRENT_TIMESTAMP null,
    user_id int null
    );

create table if not exists t_order_item0
(
    order_item_id bigint not null,
    order_id bigint not null,
    item_name varchar(255) null,
    item_status varchar(8) null,
    item_time timestamp default CURRENT_TIMESTAMP null,
    user_id int null
    );

create table if not exists t_order_item1
(
    order_item_id bigint not null,
    order_id bigint not null,
    item_name varchar(255) null,
    item_status varchar(8) null,
    item_time timestamp default CURRENT_TIMESTAMP null,
    user_id int null
    );

