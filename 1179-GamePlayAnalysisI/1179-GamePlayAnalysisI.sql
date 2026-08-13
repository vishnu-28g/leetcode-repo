-- Last updated: 13/08/2026, 09:12:15
select player_id,min(event_date) as first_login
from Activity
group by player_id