# Write your MySQL query statement below
select e1.employee_id,e1.name,count(e.reports_to) as reports_count,round(avg(e.age)) as average_age
from Employees e join Employees e1 on e.reports_to=e1.employee_id group by employee_id order by employee_id;