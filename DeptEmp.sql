/*
CREATE TABLE Department(
    deptID int AUTO_INCREMENT,
    deptName varchar(255),
    created_at datetime,
    created_by varchar(255),
    last_updated_date datetime,
    last_updated_by varchar(255)
);

ALTER TABLE Department ADD PRIMARY KEY(deptID);

CREATE TABLE Employees(
    empID int AUTO_INCREMENT,
    firstName varchar(255),
    lastName varchar(255),
    CONSTRAINT empID email varchar(255),
    phoneNum int,
    join_date date,
    created_at datetime,
    created_by varchar(255),
    last_updated_date datetime,
    last_updated_by varchar(255),
    deptID int,
    FOREIGN KEY (deptID) REFERENCES Department(deptID)
);
*/

INSERT INTO Department (deptID, deptName, created_at, created_by, last_updated_date, last_updated_by)
VALUES ('1103', 'Sales', CURDATE(), 'CD3', CURDATE(), 'UD2');


INSERT INTO Employees (empID, firstName, lastName, email, phoneNum, join_date, created_at, created_by, last_updated_date, last_updated_by, deptID)
VALUES ('5502', 'Abc', 'Def', 'abc@licious.com', '897', CURDATE(), CURDATE(), 'CE1', CURDATE(), 'UE1', '1101');


desc Department;
desc Employees;