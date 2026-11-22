SELECT e.name
From Employees e
JOIN Employees m
ON m.employee_id=e.manager_id
AND e.salary>m.salary;