-- Last updated: 13/08/2026, 09:20:33
# Write your MySQL query statement below
select score ,dense_rank() over(order by score desc) as "rank"
from Scores