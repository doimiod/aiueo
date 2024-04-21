# Write your MySQL query statement below
SELECT contest_id, round(count(contest_id)*100/(select count(user_id) from Users),2) as percentage
from Register
group by contest_id
order by percentage desc, contest_id

# select contest_id, round(count(contest_id)*100/(select count(user_id) from Users),2) as percentage
# from Users as u
# INNER JOIN Register as r
# ON u.user_id = r.user_id
# group by contest_id
# order by percentage desc, contest_id