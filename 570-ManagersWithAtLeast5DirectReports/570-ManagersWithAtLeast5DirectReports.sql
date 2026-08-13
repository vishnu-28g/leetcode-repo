-- Last updated: 13/08/2026, 09:16:46
# Write your MySQL query statement below
select name from Employee
where id IN ( select managerId from Employee
group by managerId
having count(*)>=5);