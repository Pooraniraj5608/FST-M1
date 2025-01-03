REM   Script: Activity_7_8_9
REM   FST SQL

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

 SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT MAX(purchase_amount) FROM orders;

SELECT MIN(purchase_amount) FROM orders;

SELECT COUNT(salesman_id) FROM orders;

    SELECT SUM(purchase_amount) "Total" FROM orders;

SELECT AVG(purchase_amount) "Average" FROM orders;

SELECT MAX(purchase_amount) AS "Maximum" FROM orders;

SELECT MIN(purchase_amount) AS "Minimum" FROM orders;

SELECT COUNT(distinct salesman_id) AS "Total count" FROM orders;

SELECT MAX(purchase_amount) AS "Maximum",customer_id  FROM orders GROUP BY customer_id;

SELECT MAX(purchase_amount),customer_id AS "Maximum" FROM orders GROUP BY customer_id;

SELECT MAX(purchase_amount) AS "Maximum",customer_id  FROM orders GROUP BY customer_id;

SELECT MAX(purchase_amount) AS "Maximum",salesman_id  FROM orders GROUP BY salesman_id HAVING order_date = TO_DATE('2012/08/17','YYYY/MM/DD');

SELECT MAX(purchase_amount) AS "Maximum",salesman_id  FROM orders HAVING order_date = TO_DATE('2012/08/17','YYYY/MM/DD');

SELECT MAX(purchase_amount) AS "Maximum",salesman_id  FROM orders HAVING order_date = TO_DATE('2012/08/17','YYYY/MM/DD');

SELECT MAX(purchase_amount) AS "Maximum",salesman_id  FROM orders WHERE order_date = TO_DATE('2012/08/17','YYYY/MM/DD') GROUP BY salesman_id,order_date;

SELECT MAX(purchase_amount) AS "Maximum",salesman_id  FROM orders WHERE order_date = TO_DATE('2012/08/17','YYYY/MM/DD') GROUP BY salesman_id;

SELECT MAX(purchase_amount) AS "Maximum",customer_id,order_date  FROM orders WHERE purchase_amount IN ('2030', '3450', '5760', '6000') GROUP BY customer_id;

SELECT MAX(purchase_amount) AS "Maximum",customer_id,order_date  FROM orders GROUP BY customer_id HAVING MAX(purchase_amount) IN ('2030', '3450', '5760', '6000');

SELECT MAX(purchase_amount) AS "Maximum",customer_id,order_date  FROM orders GROUP BY customer_id HAVING MAX(purchase_amount) IN (2030, 3450, 5760, 6000);

SELECT MAX(purchase_amount) AS "Maximum",customer_id,order_date  FROM orders GROUP BY customer_id,order_date HAVING MAX(purchase_amount) IN (2030, 3450, 5760, 6000);

CREATE TABLE salesman ( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

INSERT ALL 
INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

SELECT c.salesman_id, c.customer_id FROM salesman s INNER JOIN customers c ON s.salesman_id = c.salesman_id;

SELECT s.customer_id, s.salesman_id, c.grade FROM salesman s INNER JOIN customers c ON s.salesman_id = c.salesman_id WHERE grade<300 ORDER BY customer_id ;

SELECT c.customer_id, c.salesman_id, c.grade FROM salesman s INNER JOIN customers c ON s.salesman_id = c.salesman_id WHERE grade<300 ORDER BY customer_id ;

SELECT c.customer_name AS customer, c.salesman_name AS salesman, c.grade FROM salesman s LEFT OUTER JOIN customers c ON s.salesman_id = c.salesman_id WHERE c.grade<300 ORDER BY c.customer_id;

SELECT c.customer_name AS customer, s.salesman_name AS salesman, c.grade FROM salesman s LEFT OUTER JOIN customers c ON s.salesman_id = c.salesman_id WHERE c.grade<300 ORDER BY c.customer_id;

SELECT c.customer_name AS customer, s.salesman_name AS salesman, c.grade FROM salesman s LEFT OUTER JOIN customers c ON s.salesman_id = c.salesman_id WHERE c.grade<300 ORDER BY c.customer_name;

SELECT c.customer_name AS customer, s.salesman_name AS salesman, c.grade FROM salesman s LEFT OUTER JOIN customers c ON s.salesman_id = c.salesman_id WHERE c.grade<300 ORDER BY c.customer_id;

SELECT c.customer_name AS customer, s.salesman_name AS salesman, s.commission FROM salesman s INNER JOIN customers c ON s.salesman_id = c.salesman_id WHERE s.commission > 12;

SELECT * from orders;

SELECT c.customer_name AS customer, s.salesman_name AS salesman, c.grade FROM salesman s LEFT OUTER JOIN customers c ON s.salesman_id = c.salesman_id WHERE c.grade<300 ORDER BY c.customer_id;

SELECT * from orders;

SELECT o.order_no, o.order_date,o.purchase_amount,o.customer_id,c.customer_name AS "customer", o.salesman_id, s.salesman_name AS "Salesman",s.commission  
    FROM orders o  
    INNER JOIN customers c ON o.customer_id = c.customer_id  
    INNER JOIN salesman s ON o.salesman_id = s.salesman_id;

