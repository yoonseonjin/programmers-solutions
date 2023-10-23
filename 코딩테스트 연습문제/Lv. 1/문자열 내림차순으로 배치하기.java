import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split("");
        Arrays.sort(strArr);

        for (int i = strArr.length - 1; i >= 0; i--) {
            answer.append(strArr[i]);
        }
        return answer.toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12917