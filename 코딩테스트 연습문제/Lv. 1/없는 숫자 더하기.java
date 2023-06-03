class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int condition = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return condition - answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/86051