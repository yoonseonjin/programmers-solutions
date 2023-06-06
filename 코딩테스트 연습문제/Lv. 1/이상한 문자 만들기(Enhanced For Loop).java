class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int index = 0;

        for (String ss : array) {
            index = ss.contains(" ") ? 0 : index + 1;
            answer += (index % 2 == 0) ? ss.toLowerCase() : ss.toUpperCase(); 
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12930