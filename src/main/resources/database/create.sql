create database springboot;
use springboot;

create table user(
 id int(10) not null AUTO_INCREMENT primary key,
 username varchar(50) not null,
 password varchar(50)
)ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


insert into user(username,password) values ('hj','123');
insert into user(username,password) values ('lmm','123');