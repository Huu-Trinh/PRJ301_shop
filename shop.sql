Create database PRJ301_shop
use PRJ301_shop
create table [role](role_id int primary key identity(1,1),role_name nvarchar(50))

create table account(accountID int primary key identity(1,1),
username varchar(30) unique, password varchar(32) not null check(len(password)>=8),role_id int references [role](role_id))

Create table  Category(cateID int primary key identity(1,1), cateName nvarchar(50),
status bit default 1)

Create table Product(pid varchar(30) primary key,pname nvarchar(100) not null,
quantity int check(quantity>=0), price money check(price>=0), image varchar(100),
description nvarchar(max),status bit default 1,cateID int foreign key references Category(cateID))

create table Customer(cid int primary key identity(1,1), cname nvarchar(30) not null,
cphone varchar(30), cAddress nvarchar(100), accountID int references account(accountID), status bit default 1)


Create table Bill(oID varchar(32) primary key,dateCreate dateTime default getdate(),
cname nvarchar(30) not null,cphone varchar(30), cAddress nvarchar(100), total money,
status int default 0,cid int foreign key references Customer(cid) )

create table BillDetail(pid varchar(30) foreign key references Product(pid),
oID varchar(32) foreign key references Bill(oID), quantity int, price money, total money,
primary key(pid,oID))