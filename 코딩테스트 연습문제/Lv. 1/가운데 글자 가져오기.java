class Solution {
    public String solution(String s) {
        String[] answer = s.split("");

        if (answer.length % 2 == 0) {
            int midIndex = (answer.length / 2);
            return answer[midIndex - 1] + answer[midIndex];
        }
        int midIndex = ((answer.length + 1) / 2) - 1;
        return answer[midIndex];
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12903