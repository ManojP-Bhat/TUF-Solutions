SELECT
e.employee_id,
e.name,
s.salary 
FROM Employees as e
JOIN Salaries as s
ON e.employee_id=s.employee_id;