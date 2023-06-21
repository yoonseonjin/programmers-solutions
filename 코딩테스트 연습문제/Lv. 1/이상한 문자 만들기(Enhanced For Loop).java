class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int index = 0;

        for (String str : strArr) {
            index = str.contains(" ") ? 0 : index + 1;
            answer += (index % 2 == 0) ? str.toLowerCase() : str.toUpperCase(); 
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12930