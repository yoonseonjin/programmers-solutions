class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        int len = answer.length;
        
        if (len % 2 == 0) {
            int midIndex = (len / 2);
            return answer[midIndex - 1] + answer[midIndex];
        } else {
            int midIndex = ((len + 1) / 2) - 1;
            return answer[midIndex];
        }
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12903