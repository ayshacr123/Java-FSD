-- create table owner(
-- owner_ID varchar(10) ,
-- owner_name varchar(20)NULL,
-- address varchar(20)NULL,
-- phone_num bigint NULL,
-- email_ID varchar(20) NULL,
-- primary key (owner_ID)
-- );

-- create table Customer(
-- customer_ID varchar(10) ,
-- customer_name varchar(20)NULL,
-- address varchar(20)NULL,
-- phone_num bigint NULL,
-- email_ID varchar(20) NULL,
-- primary key (customer_ID)
-- );

-- create table cars(
-- car_ID varchar(10) ,
-- car_name varchar(20)NULL,
-- car_type varchar(10) NULL,
-- owner_ID varchar(10),
-- primary key (car_ID),
-- foreign key (owner_ID) REFERENCES owner(owner_ID)
-- );

 -- create table rental(
--  rental_ID varchar(10) ,
--  customer_ID varchar(20)NULL,
--  car_ID varchar(20)NULL,
--  pickup_date DATE,
--  return_date DATE,
--  km_driven int,
--  fare_amount double(10,2),
--  primary key (rental_ID),
--  foreign key (customer_ID) References Customer(customer_ID),
--  foreign key (car_ID) references cars(car_ID)
--  );

--  insert into  owner(
-- owner_ID ,
--  owner_name ,
--  address ,
--  phone_num ,
--  email_ID ) values (1,"appu","xyz",6537383535,"akku@gamil.com"),(2,"akku","ytd",3537352723,"akku@gmail.com"),(3,"Kukku","twi",4362725726,"kukku@gmail.com"),
--  (4,"Hannu","uye",4372936383,"hannu@gmail.com"),(5,"Jannu","ewd",5383623723,"jannu@gmail.com"),(6,"Muppu","okj",0283638253,"muppu@gmail.com");

-- insert into  customer(
-- customer_ID ,
--  customer_name ,
--  address ,
--  phone_num ,
--  email_ID ) values ("C001","shappu","osn",8364937393,"shappu@gamil.com"),("C003","kajju","uag",8325236917,"kajju@gmail.com"),("C004","mammu","hsd",4628525726,"mammu@gmail.com"),
--  ("C005","shanu","iee",9273837883,"shanu@gmail.com"),("C006","manu","jsg",0373826323,"manu@gmail.com"),("C007","vanu","ogs",9637253823,"vanu@gmail.com");

-- insert into  cars(
-- car_ID  ,
--  car_name ,
--  car_type ,
--  owner_ID  ) values ("V001","indica","hatchback",5),("V007","scorpio","suv",1),("V003","city","sedan",4),
--  ("V004","glanza","hatchback",3),("V005","innova","suv",2),("V006","ciaz","sedan",1);

--  insert into  cars(
--  car_ID  ,
--  car_name ,
--   car_type ,
--   owner_ID  ) values ("V002","RITZ","hatchback",6),("V008","scoda","suv",3);

 
-- insert into  rental(
-- rental_ID  ,
--  customer_ID ,
--  car_ID ,
--  pickup_date, return_date, km_driven, fare_amount ) values ("R001","C007","V004","2018-03-10","2018-03-10",800,9000),("R002","C001","V007","2018-03-11","2018-03-12",200,3000),("R003","C007","V003","2018-04-15","2018-04-15",100,1500),("R004","C007","V001","2018-05-16","2018-05-18",1000,10000),("R005","C004","V005","2018-05-10","2018-05-12",900,11000),("R006","C004","V006","2018-05-20","2018-05-21",200,2500);



-- SELECT car_id, car_name, car_type 
-- FROM cars
-- WHERE car_id NOT IN (SELECT car_id FROM rental)
-- ORDER BY car_id;

-- select car_id,car_name,car_type, owner_id
-- from cars where car_type in ('suv' ,'Hatchback') 
-- order by car_id;

-- Alter table cars add  column car_regno varchar(10);

-- select car_id,car_name,car_type from cars 
-- where car_name = "ritz" or car_type="sedan"
-- order by car_id;


-- select distinct o.owner_id,o.owner_name,o.address,o.phone_num from owner o
-- join cars c on o.owner_id=c.owner_id
-- where c.car_name like "ritz"
-- order by o.owner_id;

-- select rental_id,car_id,customer_id,km_driven from rental
-- where pickup_date between "2018-03-10" and "2018-05-21"
-- order by rental_id;

-- select distinct car_id,count(car_id) as count from rental group by car_id;
