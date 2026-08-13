-- Last updated: 13/08/2026, 09:12:33
select product_id,year as first_year, quantity, price
from Sales
where(product_id, year) in (select  product_id, min(year) from Sales group by product_id)
