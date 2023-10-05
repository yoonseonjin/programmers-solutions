SELECT B.CATEGORY, 
       SUM(S.SALES) AS TOTAL_SALES
FROM BOOK AS B LEFT JOIN BOOK_SALES AS S
ON B.BOOK_ID = S.BOOK_ID
WHERE S.SALES_DATE LIKE '2022-01%'
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY ASC;

-- https://school.programmers.co.kr/learn/courses/30/lessons/144855