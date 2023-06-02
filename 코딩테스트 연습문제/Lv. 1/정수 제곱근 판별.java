class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        }
        return -1;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12934