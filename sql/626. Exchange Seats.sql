# Write your MySQL query statement below
SELECT CASE
           WHEN s.id % 2 != 0 AND s.id = (SELECT COUNT(*) FROM Seat) THEN s.id
           WHEN s.id % 2 = 0 THEN s.id - 1
           ELSE
               s.id + 1
           END AS id,
       student
FROM Seat AS s
ORDER BY id
# これはまずidを変えて最後にidでソートすることによって順番を変えることに成功している！