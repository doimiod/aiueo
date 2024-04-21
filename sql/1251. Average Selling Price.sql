# Write your MySQL query statement below
select p.product_id, IFNULL(ROUND(SUM(units*price)/SUM(units),2),0) AS average_price
from Prices as p
left outer join UnitsSold as u
on p.product_id = u.product_id and purchase_date between start_date and end_date
group by p.product_id