# Write your MySQL query statement below
select customer_id, count(v.visit_id) as count_no_trans
from Visits as v
left outer join Transactions as t
on v.visit_id = t.visit_id
where transaction_id is null
group by customer_id

# when left join
# | visit_id | customer_id | transaction_id | visit_id | amount |
# | -------- | ----------- | -------------- | -------- | ------ |
# | 1        | 23          | 12             | 1        | 910    |
# | 2        | 9           | 13             | 2        | 970    |
# | 4        | 30          | null           | null     | null   |
# | 5        | 54          | 9              | 5        | 200    |
# | 5        | 54          | 3              | 5        | 300    |
# | 5        | 54          | 2              | 5        | 310    |
# | 6        | 96          | null           | null     | null   |
# | 7        | 54          | null           | null     | null   |
# | 8        | 54          | null           | null     | null   |


# 実験　inner join
# select *
# from Visits as v
# inner join Transactions as t
# on v.visit_id = t.visit_id

# | visit_id | customer_id | transaction_id | visit_id | amount |
# | -------- | ----------- | -------------- | -------- | ------ |
# | 1        | 23          | 12             | 1        | 910    |
# | 2        | 9           | 13             | 2        | 970    |
# | 5        | 54          | 9              | 5        | 200    |
# | 5        | 54          | 3              | 5        | 300    |
# | 5        | 54          | 2              | 5        | 310    |