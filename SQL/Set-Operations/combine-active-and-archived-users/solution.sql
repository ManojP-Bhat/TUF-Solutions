Select user_id from ActiveUsers 
UNION
Select user_id from ArchivedUsers;