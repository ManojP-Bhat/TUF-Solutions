SELECT order_id,order_date,amount FROM OnlineOrders
WHERE order_date>='2023-01-01'
UNION
SELECT order_id,order_date,amount FROM StoreOrders
WHERE order_date>='2023-01-01'
ORDER BY amount DESC;