SELECT 
    USER_ID, 
    PRODUCT_ID
FROM ONLINE_SALE
GROUP BY 
    USER_ID, 
    PRODUCT_ID
HAVING COUNT(USER_ID) > 1
ORDER BY 
    USER_ID ASC, 
    PRODUCT_ID DESC;

-- https://school.programmers.co.kr/learn/courses/30/lessons/131536