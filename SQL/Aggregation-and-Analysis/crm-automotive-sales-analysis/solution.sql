SELECT date_id,make_name,
COUNT(DISTINCT lead_id) as unique_leads,
count(distinct partner_id) as unique_partners
from DailySales
group by date_id,make_name
order by date_id ASC,make_name ASC