# Write your MySQL query statement below
select class
from Courses
group by class
having count(student)>=5

# Write your MySQL query statement below
select class
from Courses
group by class
having count(*) >=5;

#  二度手間太郎
select class
from Courses
where (class) in(
    select class
    from Courses
    group by class
    having count(student) >=5
)
group by class