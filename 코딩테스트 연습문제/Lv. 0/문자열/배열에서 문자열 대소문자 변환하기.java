class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 1) {
                answer[i] = strArr[i].toUpperCase();
            }
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181875