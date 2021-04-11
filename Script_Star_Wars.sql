create database starWars;

use starWars;

create table Orders(
	orderId int IDENTITY(1,1) PRIMARY KEY,
	customerName varchar(80) NOT NULL,
	unitPrice decimal(5,2) NOT NULL,
	amount int NOT NULL
);

insert into Orders values
('Anna', 10.0, 2),
('DeathStar', 10.0, 1),
('DeathStar', 20.0, 2),
('DeathStar', 30.0, 3),
('Miguel', 50.0, 2)

select orderId, customerName, (unitPrice * amount) as totalPrice from Orders
where customerName = 'DeathStar'