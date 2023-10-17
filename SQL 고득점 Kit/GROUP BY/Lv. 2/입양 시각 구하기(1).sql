SELECT 
    HOUR(DATETIME) AS HOUR, 
    COUNT(DATETIME) AS COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR(DATETIME)
HAVING 
    HOUR >= 9 
    AND HOUR <= 19
ORDER BY HOUR ASC;

-- https://school.programmers.co.kr/learn/courses/30/lessons/59412