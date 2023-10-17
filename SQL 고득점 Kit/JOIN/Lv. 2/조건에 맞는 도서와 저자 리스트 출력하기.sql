SELECT 
    BOOK.BOOK_ID, 
    AUTHOR.AUTHOR_NAME, 
    DATE_FORMAT(BOOK.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK 
LEFT JOIN AUTHOR
ON BOOK.AUTHOR_ID = AUTHOR.AUTHOR_ID
WHERE BOOK.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE ASC;

-- https://school.programmers.co.kr/learn/courses/30/lessons/144854