-- Last updated: 13/08/2026, 09:16:17
# Write your MySQL query statement below
SELECT x,y,z,
case WHEN (x+y) > z AND (x+z) > y AND (y+z) > x THEN 'Yes' ELSE 'No' end AS triangle
FROM Triangle 