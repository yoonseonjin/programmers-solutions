class Solution {
    public int solution(String number) {
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }
        return answer % 9;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181914