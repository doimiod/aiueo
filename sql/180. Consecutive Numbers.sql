# Write your MySQL query statement below
select l1.num as ConsecutiveNums
from Logs as l1, Logs as l2, Logs as l3
where l1.id = l2.id -1 and l2.id = l3.id-1 and l1.num = l2.num and l2.num = l3.num
group by l1.num

# Write your MySQL query statement below
with cte as (
    select num,
    lead(num,1) over() num2,
    lead(num,2) over() num3
    from logs
)
select distinct num ConsecutiveNums from cte where (num=num1) and (num=num2)