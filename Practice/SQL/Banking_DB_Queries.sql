1. SELECT NAME 'NAME', product_type_CD 'TYPE'
	FROM product;

2. SELECT b.NAME, b.CITY, e.LAST_NAME, e.TITLE
	FROM branch b JOIN employee e ON b.BRANCH_ID = e.ASSIGNED_BRANCH_ID;

3. SELECT DISTINCT TITLE
	FROM employee;

4. SELECT e.LAST_NAME, e.TITLE, s.LAST_NAME, s.TITLE
	FROM employee e
	LEFT JOIN employee s ON s.EMP_ID = e.SUPERIOR_EMP_ID;

5. SELECT p.NAME, a.AVAIL_BALANCE, c.LAST_NAME
	FROM account a JOIN product p ON a.PRODUCT_CD = p.PRODUCT_CD
	JOIN individual c ON a.CUST_ID = c.CUST_ID

6. SELECT t.*, i.LAST_NAME
	FROM account a JOIN acc_transaction t ON a.ACCOUNT_ID = t.ACCOUNT_ID
	JOIN individual i ON a.CUST_ID = i.CUST_ID
	WHERE i.LAST_NAME LIKE 't%';