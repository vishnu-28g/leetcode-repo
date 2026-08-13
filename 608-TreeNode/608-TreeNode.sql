-- Last updated: 13/08/2026, 09:16:21
# Write your MySQL query statement below
SELECT id,

    CASE 
        WHEN p_id IS NULL THEN 'Root'
        WHEN id IN (SELECT p_id FROM Tree)THEN 'Inner'
        ELSE 'Leaf' 
        END AS type
 FROM Tree
		