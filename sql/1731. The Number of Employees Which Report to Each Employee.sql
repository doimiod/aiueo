# Write your MySQL query statement below
select e1.employee_id, e1.name, count(e2.reports_to) as reports_count, round(avg(e2.age)) as average_age
from Employees as e1
INNER JOIN Employees as e2
ON e1.employee_id = e2.reports_to
group by e1.employee_id
order by e1.employee_id