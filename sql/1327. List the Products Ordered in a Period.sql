# Write your MySQL query statement below
select p.product_name as product_name, sum(o.unit) as unit
from Products as p
LEFT OUTER JOIN Orders as o
on p.product_id = o.product_id
where order_date like '2020-02-%'
group by p.product_name
having sum(o.unit) >= 100