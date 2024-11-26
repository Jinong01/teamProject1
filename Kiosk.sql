create database kiosk;
use kiosk;

create table category (id int primary key auto_increment , category_name varchar(30) not null); 

create table dish (id int primary key auto_increment , dish_name varchar(30) not null , 
price int not null , number int , temperature boolean , shot boolean , category_id int , unit_sold int, foreign key(category_id) references category(id));

create table orders (id int primary key auto_increment , status int , order_time timestamp , end_time timestamp );

create table shopping_cart (id int primary key auto_increment , user_id int , total_amount double , point int , type boolean ); 

insert into category (category_name) values ();