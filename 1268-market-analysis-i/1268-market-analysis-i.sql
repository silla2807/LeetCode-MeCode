WITH buyers AS (
    SELECT buyer_id 
    FROM orders 
    WHERE YEAR(order_date) = 2019
),
counts AS (
    SELECT buyer_id, COUNT(buyer_id) AS buyer_count 
    FROM buyers 
    GROUP BY buyer_id
)
SELECT u.user_id as buyer_id, u.join_date, CASE 
        WHEN c.buyer_count IS NULL THEN 0
        ELSE c.buyer_count
    END AS orders_in_2019
FROM Users u 
LEFT JOIN counts c 
ON u.user_id = c.buyer_id;
