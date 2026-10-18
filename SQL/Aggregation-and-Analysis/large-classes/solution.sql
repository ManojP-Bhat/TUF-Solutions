SELECT class from Courses
group by class 
having count(*)>=4 
order by class ASC
