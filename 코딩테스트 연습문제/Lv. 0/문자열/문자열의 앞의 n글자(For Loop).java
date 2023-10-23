class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        String[] array = my_string.split("");

        for (int i = 0; i < n; i++) {
            answer.append(array[i]);
        }
        return answer.toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181907