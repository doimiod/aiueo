# Write your MySQL query statement below
(
    select u.name as results
    from Users as u
    LEFT OUTER JOIN MovieRating as m
    ON u.user_id = m.user_id
    group by u.name
    order by count(m.user_id) desc, u.name
    limit 1
)
union all
(
    select m.title as results
    from Movies as m
    LEFT OUTER JOIN MovieRating as mr
    ON m.movie_id = mr.movie_id
    where mr.created_at like ('2020-02-%')
    group by m.title
    order by avg(mr.rating) desc, m.title
    limit 1
)