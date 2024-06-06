SELECT cp.CART_ID,
       CASE
           WHEN SUM(cp.PRICE) >= 50000 THEN SUM(cp.PRICE) - 5000
           WHEN SUM(cp.PRICE) >= 30000 THEN SUM(cp.PRICE) - 3000
           ELSE SUM(cp.PRICE)
           END as '결제액'
FROM CART_PRODUCTS cp
GROUP BY cp.CART_ID