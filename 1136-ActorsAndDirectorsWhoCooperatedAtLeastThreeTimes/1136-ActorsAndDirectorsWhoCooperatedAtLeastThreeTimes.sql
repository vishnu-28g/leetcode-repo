-- Last updated: 13/08/2026, 09:12:42
# Write your MySQL query statement below
select actor_id, director_id 
from(
select actor_id,director_id, 
count(timestamp) as cooperated 
from ActorDirector 
group by actor_id,director_id) 
table1
where cooperated>=3;