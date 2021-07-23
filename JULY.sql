/*
CREATE DATABASE july;
*/

/*
CREATE TABLE july.dept(
    deptID int AUTO_INCREMENT,
    deptName varchar(255) NOT NULL,
    created_at timestamp,
    created_by varchar(255) NOT NULL,
    last_updated_date timestamp,
    last_updated_by varchar(255) NOT NULL,
    PRIMARY KEY(deptID)
);

CREATE TABLE july.emp(
    empID int AUTO_INCREMENT UNIQUE,
    firstName varchar(255) NOT NULL,
    lastName varchar(255) NOT NULL,
    dob varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    phoneNum varchar(15) NOT NULL,
    salary int NOT NULL,
    join_date date,
    created_at timestamp,
    created_by varchar(255) NOT NULL,
    last_updated_date timestamp,
    last_updated_by varchar(255) NOT NULL,
    deptID int,
    CONSTRAINT FOREIGN KEY (deptID) REFERENCES july.dept(deptID) ON DELETE SET NULL
);
*/
/*
INSERT INTO july.dept (deptName, created_at, created_by, last_updated_date, last_updated_by)
VALUES ('Tech', CURDATE(), 'CD1', CURDATE(), 'UD1'), 
('HR', CURDATE(), 'CD2', CURDATE(), 'UD1'), 
('Sales', CURDATE(), 'CD3', CURDATE(), 'UD2'),
('Customer Service', CURDATE(), 'CD1', CURDATE(), 'UD3');
*/
/*
ALTER TABLE july.emp
ADD phoneNum VARCHAR(15) AFTER email;
*/

/*
INSERT INTO july.emp (firstName, lastName, dob, email, phoneNum, salary, join_date, created_at, created_by, last_updated_date, last_updated_by, deptID)
VALUES ('Abc', 'Def', '18-02-2000', 'abc@licious.com', '8975634688', '10000', CURDATE(), CURDATE(), 'CE1', CURDATE(), 'UE1', '1'), 
('Ghi', 'Jkl', '10-04-1997', 'ghi@licious.com', '9870634688', '15000', CURDATE(), CURDATE(), 'CE2', CURDATE(), 'UE1', '2'),
('Mno', 'Pqr', '16-06-1995', 'mno@licious.com', '76585634688', '20000', CURDATE(), CURDATE(), 'CE1', CURDATE(), 'UE2', '3'),
('St', 'Uv', '23-09-2002', 'st@licious.com', '6085634688', '5000', CURDATE(), CURDATE(), 'CE3', CURDATE(), 'UE3', '3'), 
('Wx', 'Yz', '06-11-1991', 'wx@licious.com', '7007634688', '45000', CURDATE(), CURDATE(), 'CE4', CURDATE(), 'UE3', '4');
*/

/*
UPDATE july.emp SET salary=salary+500 WHERE deptID=3;
DELETE FROM july.emp WHERE empID=1;
DELETE FROM july.emp WHERE deptID=2;

desc Department;
desc Employees;
*/

/*
DROP DATABASE IF EXISTS DeptEmp;

ALTER TABLE greeting.Employeesnew DROP FOREIGN KEY employeesnew_ibfk_1;

DROP TABLE greeting.Employeesnew;
DROP TABLE greeting.Departmentnew;
*/
