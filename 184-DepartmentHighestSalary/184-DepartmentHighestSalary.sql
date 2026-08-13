-- Last updated: 13/08/2026, 09:20:15
select
Department
,Employee
,Salary
from 
(
    select
    d.Name Department
    ,e.Name Employee
    ,e.Salary
    ,rank() over (partition by e.DepartmentId order by e.Salary desc) rn
    from Employee e join Department d on e.DepartmentId = d.Id
) sub
where rn = 1