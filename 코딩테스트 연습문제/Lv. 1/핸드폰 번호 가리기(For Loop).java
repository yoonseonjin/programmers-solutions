class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = phone_number.split("");

        for (int i = 0; i < strArr.length - 4; i++) {
            strArr[i] = "*";
            answer.append(strArr[i]);
        }
        return answer + phone_number.substring(phone_number.length() - 4);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12948