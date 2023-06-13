class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] array = my_string.split("");
        
        for (int i = 0; i < n; i++) {
            answer += array[i];
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181907