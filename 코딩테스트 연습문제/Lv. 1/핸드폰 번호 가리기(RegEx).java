class Solution {
    public String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12948