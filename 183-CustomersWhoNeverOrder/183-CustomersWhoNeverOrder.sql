-- Last updated: 13/08/2026, 09:20:20
# Write your MySQL query statement below
SELECT C.name AS Customers
FROM Customers C
LEFT JOIN Orders O
    ON C.id = O.customerId
WHERE O.id IS NULL;