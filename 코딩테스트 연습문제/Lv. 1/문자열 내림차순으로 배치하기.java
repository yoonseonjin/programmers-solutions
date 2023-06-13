import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        Arrays.sort(array);
        
        for (int i = array.length - 1; i >= 0; i--) {
            answer += array[i];
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12917