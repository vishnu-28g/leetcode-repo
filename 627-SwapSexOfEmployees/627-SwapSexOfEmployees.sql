-- Last updated: 13/08/2026, 09:16:04
# Write your MySQL query statement below
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;