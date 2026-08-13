-- Last updated: 13/08/2026, 09:20:41
# Write your MySQL query statement below
select Person.firstName, Person.lastName,Address.city,Address.state
from Person 
left join Address
on Person.personId = Address.personId;