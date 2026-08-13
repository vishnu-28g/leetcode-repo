-- Last updated: 13/08/2026, 09:12:43

# Write your MySQL query statement below
select customer_id
from Customer
group by customer_id
having count(distinct product_key) = (select count(product_key) from Product);