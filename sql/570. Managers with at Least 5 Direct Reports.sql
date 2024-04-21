# Write your MySQL query statement below
# select e1.name
# from Employee as e1
# CROSS JOIN Employee as e2
# where e1.id = e2.managerId and e1.id != e2.id
# group by e2.managerId
# HAVING COUNT(e2.managerId) >= 5;

SELECT E1.name
FROM Employee E1
JOIN (
    SELECT managerId, COUNT(managerId) AS directReports
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(managerId) >= 5
) E2 ON E1.id = E2.managerId;