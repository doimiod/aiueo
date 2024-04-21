# Write your MySQL query statement below
SELECT p.project_id, round(AVG(experience_years),2) as average_years
from Project as p
LEFT OUTER JOIN Employee as e
ON p.employee_id = e.employee_id
group by p.project_id