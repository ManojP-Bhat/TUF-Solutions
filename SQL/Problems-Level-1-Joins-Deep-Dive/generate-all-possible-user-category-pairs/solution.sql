SELECT u.user_id,
u.name,
c.category_id,
c.category
FROM Users as u
CROSS JOIN Categories as c