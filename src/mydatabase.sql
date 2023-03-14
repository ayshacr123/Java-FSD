
-- CREATE TABLE Department (
--     department_id INT NOT NULL AUTO_INCREMENT,
--     department_name VARCHAR(50) NOT NULL,
--     manager_id INT,
--     location VARCHAR(100),
--     PRIMARY KEY (department_id)
-- );

-- CREATE TABLE Employee (
--     employee_id INT NOT NULL AUTO_INCREMENT,
--     first_name VARCHAR(50) NOT NULL,
--     last_name VARCHAR(50) NOT NULL,
--     email VARCHAR(100) UNIQUE NOT NULL,
--     phone VARCHAR(20),
--     hire_date DATE NOT NULL,
--     job_title VARCHAR(50) NOT NULL,
--     department_id INT NOT NULL,
--     salary DECIMAL(10,2) NOT NULL,
--     PRIMARY KEY (employee_id),
--     FOREIGN KEY (department_id) REFERENCES Department(department_id)
-- );

-- INSERT INTO Employee
-- (employee_id, first_name, last_name,email ,phone,hire_date,job_title,department_id,salary)
-- VALUES(1,"Appu","P P","appupp@gamail.com","63363736",'2012-11-03',"Developer",304,25000),(2,"Achu","O O","achuoo@gamil.com","8754467",'2019-09-25',"Associate",654,12000);

-- INSERT INTO Department 
-- ( department_id, department_name, manager_id, location )
-- VALUES (654,"Backend",6,"Kollam");

-- select upper(first_name) as Empname from employee;


-- SELECT COUNT(*)FROM EMPLOYEE WHERE JOB_TITLE='HR' 

-- Select current_date;


-- SELECT SUBSTRING(Empname,1,4) from employee;


-- select * FROM EMPLOYEE WHERE salary >= '50000' AND Salary <= '100000';

--  Select location from department;
-- SELECT SUBSTRING_INDEX (location,'(',1) FROM department;

-- CREATE TABLE new_tbl as SELECT * FROM department;
-- select * from new_tbl;

-- SELECT * FROM employee WHERE Empname LIKE 'A%';


-- select concat(Empname, ' ', last_name) as FullName from employee;

 -- INSERT INTO Employee
--   (employee_id, Empname, last_name,email ,phone,hire_date,job_title,department_id,salary)
--  VALUES(3,"Muchu","YY","muchuyyp@gamail.com","63367736",'2012-11-03',"HR",809,555000),(4,"Janu","II","januii@gamil.com","8646467",'2019-09-25',"HR",985,120000);

-- INSERT INTO Department 
--  ( department_id, department_name, manager_id, location )
--  VALUES (809,"Public",99,"Kottayam"),(985,"Frontend",76,"Tripunithura");


-- Select * from Employee limit 3;



