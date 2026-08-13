-- Last updated: 13/08/2026, 09:20:23
# Write your MySQL query statement below
select email 
from Person 
group by email
having count(email)>1;
