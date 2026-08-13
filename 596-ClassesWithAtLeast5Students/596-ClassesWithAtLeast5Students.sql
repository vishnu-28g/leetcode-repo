-- Last updated: 13/08/2026, 09:16:29
# Write your MySQL query statement below
select class from Courses
group by class having count(student)>=5;