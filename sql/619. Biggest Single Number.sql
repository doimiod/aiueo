SELECT max(num) num
FROM (
    SELECT num, COUNT(*) AS num_count
    FROM MyNumbers
    GROUP BY num
    HAVING num_count = 1
    ORDER BY num desc
) AS sub