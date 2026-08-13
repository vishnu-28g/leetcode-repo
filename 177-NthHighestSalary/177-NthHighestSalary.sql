-- Last updated: 13/08/2026, 09:20:36
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN

    set N = N-1;
  RETURN (
      # Write your MySQL query statement below.
        select distinct salary
        from Employee
        order by salary DESC
        limit 1 offset N # offset n-1
  );
END