SET NAMES utf8;

DROP DATABASE IF EXISTS cloud;
CREATE DATABASE cloud DEFAULT CHARSET utf8mb4;
USE cloud;

DROP TABLE IF EXISTS payment;
CREATE TABLE payment
(
    id       BIGINT(20) not null auto_increment COMMENT 'id',
    serial   varchar(200)   default '',
    primary key (id)
) COMMENT 'payment_table';

INSERT INTO payment (id, serial) VALUE (1,'test');