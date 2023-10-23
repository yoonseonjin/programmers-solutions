class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split("");
        int index = 0;

        for (String str : strArr) {
            index = str.contains(" ") ? 0 : index + 1;
            answer.append((index % 2 == 0) ? str.toLowerCase() : str.toUpperCase());
        }
        return answer.toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12930