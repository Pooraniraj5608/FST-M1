REM   Script: Activity_1_2_3_4_5
REM   This is for FST SQL

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commision int);

DESCRIBE salesman


INSERT ALL 
INTO salesman VALUES(5001,'James Hoog','New York',15) 
 INTO salesman VALUES(5002,'Nail Knite','Paris',13) 
    INTO salesman VALUES(5005,'Pit Alex','London',11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 from DUAL;

SELECT * from salesman;

SELECT salesman_id,salesman_city from salesman;

SELECT * FROM salesman WHERE salesman_city = 'Paris';

ssion of Paul Adam 


SELECT salesman_id, commission from salesman where salesman_name = 'Paul Adam';

SELECT salesman_id, commission from salesman where salesman_name = 'Paul Adam';

SELECT salesman_id, commision from salesman where salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade = 200 where salesman_city = 'Rome';

UPDATE salesman SET grade = 300 where salesman_name='James Hoog';

UPDATE salesman SET salesman_name = 'Pierre' where salesman_name ='McLyon';

SELECT * FROM salesman;

