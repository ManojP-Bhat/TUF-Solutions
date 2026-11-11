SELECT sale_id,sale_date,amount FROM DomesticSales 
UNION ALL
SELECT sale_id,sale_date,amount FROM InternationalSales
ORDER BY sale_id,sale_date;