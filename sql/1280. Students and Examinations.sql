# Write your MySQL query statement below
# select s.student_id, s.student_name, e.subject_name, count(distinct e.subject_name) as attended_exams
# from Students as s, Examinations as e, Subjects as su
# where s.student_id = e.student_id
# group by s.student_name, e.subject_name

SELECT s.student_id, s.student_name, sub.subject_name, COUNT(e.subject_name) as attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT OUTER JOIN Examinations as e
on s.student_id = e.student_id and sub.subject_name = e.subject_name
# where e.subject_name is not null # if you want to delete the subject the student did not take
group by s.student_id, s.student_name, sub.subject_name
order by s.student_id, sub.subject_name