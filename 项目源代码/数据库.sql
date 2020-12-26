drop database kcsj;

CREATE DATABASE kcsj DEFAULT CHARACTER SET utf8;

use kcsj;

create table meterial_type(
id int primary key auto_increment,
name varchar(255),
person varchar(255),
create_date date
)charset=utf8;

create table meterial
(
id int primary key auto_increment,
name varchar(255),
person varchar(255),
create_date date,
type int,
count varchar(255),
inspectCount varchar(255),
remark varchar(255),
phone_number varchar(20),
UNIQUE key(name),
foreign key (type) references meterial_type(id) ON DELETE CASCADE
)charset='utf8';

create table orders(
id int primary key auto_increment,
name varchar(255) not null ,
meterial_id int not null,
count varchar(255) not null ,
person varchar(255) not null ,
phone varchar(15) not null ,
reason varchar(255) default null ,
inb int(1) not null ,
create_date date not null ,
foreign key(meterial_id) references meterial(id) ON DELETE CASCADE
)charset=utf8;