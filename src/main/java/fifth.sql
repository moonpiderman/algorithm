SELECT
    M.ID,
    M.NAME,
    C.CREATED_AT,
    C.RUNNING_TOTAL AS PRICE
FROM
    MERCHANTS M
        JOIN
    (
        SELECT
            CU.MERCHANT_ID,
            CU.CREATED_AT,
            (SELECT SUM(AMOUNT)
             FROM CARD_USAGES
             WHERE MERCHANT_ID = CU.MERCHANT_ID
               AND CREATED_AT <= CU.CREATED_AT
               AND CATEGORY = 0) AS RUNNING_TOTAL
        FROM
            CARD_USAGES CU
        WHERE
            CU.CATEGORY = 0
    ) C
    ON
        M.ID = C.MERCHANT_ID
WHERE
    C.RUNNING_TOTAL > 110000
GROUP BY m.NAME
ORDER BY
    M.ID ASC;