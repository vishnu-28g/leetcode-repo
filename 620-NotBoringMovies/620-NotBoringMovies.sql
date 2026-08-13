-- Last updated: 13/08/2026, 09:16:10
# Write your MySQL query statement below
SELECT *
FROM cinema AS c
where c.id % 2 =1
and
c.description != 'boring'
order by c.rating desc;