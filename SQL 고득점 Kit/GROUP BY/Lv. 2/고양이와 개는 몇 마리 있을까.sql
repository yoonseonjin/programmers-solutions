SELECT 
    ANIMAL_TYPE, 
    COUNT(ANIMAL_TYPE) AS count
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE ASC;

-- https://school.programmers.co.kr/learn/courses/30/lessons/59040