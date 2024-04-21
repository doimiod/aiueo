select
query_name,
round(avg(cast(rating as decimal) / position), 2) as quality,
round(sum(case when rating < 3 then 1 else 0 end) * 100 / count(*), 2) as poor_query_percentage
from
queries
where query_name is not null
group by
query_name;


# Write your MySQL query statement below
SELECT query_name, round((sum(rating/position)/count(query_name)),2) as quality,
round((sum(if(rating<3,1,0))*100/count(query_name)),2) as poor_query_percentage
from Queries
where query_name is not null
group by query_name