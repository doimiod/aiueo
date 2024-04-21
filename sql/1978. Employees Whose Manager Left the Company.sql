# Write your MySQL query statement below
select employee_id
from employees
where salary < 30000 and manager_id not in(
    select employee_id from employees
)
order by employee_id 

# Write your MySQL query statement below
select e1.employee_id
from Employees as e1
LEFT OUTER JOIN Employees as e2
ON e1.manager_id = e2.employee_id
where e1.salary < 30000 and e2.employee_id is null and e1.manager_id is not null
group by e1.employee_id
order by e1.employee_id

# select *
# from Employees as e1
# LEFT OUTER JOIN Employees as e2
# ON e2.employee_id = e1.manager_id