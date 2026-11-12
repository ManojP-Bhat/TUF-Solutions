SELECT 
e.employee_id,
e.name,
d.dept_name
FROM Employee AS e
RIGHT JOIN Department AS d
ON e.dept_id=d.dept_id;